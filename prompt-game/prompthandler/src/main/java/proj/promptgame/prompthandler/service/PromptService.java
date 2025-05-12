package proj.promptgame.prompthandler.service;

import java.util.List;

import proj.promptgame.prompthandler.model.PromptDto;


public interface PromptService {

    List<PromptDto> getAllPrompts();

    PromptDto createPrompt(PromptDto prompt);

    PromptDto getPromptById(Long id);

    PromptDto updatePrompt(Long id, PromptDto prompt);

    void deletePrompt(Long id);
}
