package proj.promptgame.prompttoJSON.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import proj.promptgame.prompttoJSON.model.PromptDto;

import java.util.List;

@FeignClient(name = "prompt-handler")
public interface PromptHandlerClient {
    @GetMapping("/api/prompts")
    List<PromptDto> getAllPrompts();
}
