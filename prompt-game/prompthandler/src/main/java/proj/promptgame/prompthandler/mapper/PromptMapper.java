package proj.promptgame.prompthandler.mapper;


import proj.promptgame.prompthandler.model.Prompt;
import proj.promptgame.prompthandler.model.PromptDto;

public class PromptMapper {

    public static PromptDto mapToPromptDto(Prompt prompt){
      return new PromptDto(prompt.getId(),
              prompt.getTopic(),
              prompt.getActivity(),
              prompt.getIntensity(),
              prompt.getText());
    }

    public static Prompt mapToPrompt(PromptDto promptDto){
        Prompt prompt = new Prompt();
                prompt.setTopic(promptDto.getTopic());
                prompt.setActivity(promptDto.getActivity());
                prompt.setIntensity(promptDto.getIntensity());
                prompt.setText(promptDto.getText());
                return prompt;
    }
}
