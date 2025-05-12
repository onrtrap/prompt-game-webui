package proj.promptgame.prompthandler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proj.promptgame.prompthandler.model.PromptDto;
import proj.promptgame.prompthandler.service.PromptService;

import java.util.List;

@RestController
@RequestMapping("/api/prompts")
public class PromptHandlerController {
    @Autowired
    private PromptService promptService;

    @GetMapping
    public ResponseEntity<List<PromptDto>> getAllPrompts(){
        List<PromptDto> prompts = promptService.getAllPrompts();
        return ResponseEntity.ok(prompts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PromptDto> getPromptById(@PathVariable Long id) {
        PromptDto prompt = promptService.getPromptById(id);
        return ResponseEntity.ok(prompt);
    }

    @PostMapping
    public ResponseEntity<PromptDto> createPrompt(@RequestBody PromptDto promptDto){
        PromptDto createdPrompt = promptService.createPrompt(promptDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPrompt);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PromptDto> updatePrompt(@PathVariable Long id, @RequestBody PromptDto promptDto) {
        PromptDto updatedPrompt = promptService.updatePrompt(id, promptDto);
        return ResponseEntity.ok(updatedPrompt);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrompt(@PathVariable Long id) {
        promptService.deletePrompt(id);
        return ResponseEntity.noContent().build();
    }

}
