package proj.promptgame.prompttoJSON.model;

import java.util.List;

public class PromptsWrapper {
    private List<PromptDto> Prompts;

    // Constructor
    public PromptsWrapper(List<PromptDto> Prompts) {
        this.Prompts = Prompts;
    }

    // Getter
    public List<PromptDto> getPrompts() {
        return Prompts;
    }

    // Setter
    public void setPrompts(List<PromptDto> Prompts) {
        this.Prompts = Prompts;
    }
}
