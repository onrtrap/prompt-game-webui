package proj.promptgame.prompthandler.service;

//import com.netflix.discovery.converters.Auto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import proj.promptgame.prompthandler.exception.ResourceNotFoundException;
import proj.promptgame.prompthandler.mapper.PromptMapper;
import proj.promptgame.prompthandler.model.Prompt;
import proj.promptgame.prompthandler.model.PromptDto;
import proj.promptgame.prompthandler.repository.PromptRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PromptServiceImpl implements PromptService {

    @Autowired
    private PromptRepository promptRepository;

    @Override
    public List<PromptDto> getAllPrompts() {
        List<Prompt> prompts = promptRepository.findAll();
        return prompts.stream()
                .map(PromptMapper::mapToPromptDto)
                .collect(Collectors.toList());
    }

    @Override
    public PromptDto createPrompt(PromptDto promptDto) {
        Prompt prompt = PromptMapper.mapToPrompt(promptDto);
        Prompt savedPrompt = promptRepository.save(prompt);
        return PromptMapper.mapToPromptDto(savedPrompt);
    }

    @Override
    public PromptDto getPromptById(Long id) {
        Prompt prompt = promptRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("The prompt with " + id + " does not exist." ));
        return PromptMapper.mapToPromptDto(prompt);
    }

    @Override
    public PromptDto updatePrompt(Long id, PromptDto promptDto) {
        Prompt existingPrompt = promptRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("The prompt with " + id + " does not exist."));

        existingPrompt.setTopic(promptDto.getTopic());
        existingPrompt.setActivity(promptDto.getActivity());
        existingPrompt.setIntensity(promptDto.getIntensity());
        existingPrompt.setText(promptDto.getText());
        existingPrompt.setSafe(promptDto.isSafe());

        promptRepository.save(existingPrompt);

        return PromptMapper.mapToPromptDto(existingPrompt);
    }

    @Override
    public void deletePrompt(Long id) {
        promptRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("The prompt with " + id + " does not exist."));

        promptRepository.deleteById(id);
    }

}
