package proj.promptgame.prompttoJSON.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj.promptgame.prompttoJSON.client.PromptHandlerClient;
import proj.promptgame.prompttoJSON.model.PromptDto;
import proj.promptgame.prompttoJSON.model.PromptsWrapper;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PromptHandlerController {
    @Autowired
    private PromptHandlerClient promptHandlerClient;


    @GetMapping("/data")
    public ResponseEntity<PromptsWrapper> sendJson(){
        PromptsWrapper promptsWrapper = new PromptsWrapper(promptHandlerClient.getAllPrompts());
        return ResponseEntity.ok(promptsWrapper);
    }
}
