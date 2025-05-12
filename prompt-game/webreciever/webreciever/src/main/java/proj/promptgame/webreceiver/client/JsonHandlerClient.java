package proj.promptgame.webreceiver.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import proj.promptgame.webreceiver.model.PromptDto;

import java.util.List;

@FeignClient(name = "prompt-handler")
public interface JsonHandlerClient {
    @GetMapping("/api/prompts")
    List<PromptDto> getAllPrompts();

    @GetMapping("/api/prompts/{id}")
    PromptDto getPromptById(@PathVariable Long id);

    @PostMapping("/api/prompts")
    PromptDto createPrompt(@RequestBody PromptDto promptDto);

    @PutMapping("/api/prompts/{id}")
    PromptDto updatePrompt(@PathVariable Long id, @RequestBody PromptDto promptDto);

    @DeleteMapping("/api/prompts/{id}")
    void deletePrompt(@PathVariable Long id);
}
