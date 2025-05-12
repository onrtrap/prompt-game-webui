package proj.promptgame.webreceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proj.promptgame.webreceiver.client.JsonHandlerClient;
import proj.promptgame.webreceiver.model.PromptDto;

import java.util.List;
@RestController
@RequestMapping("/api")
public class WebReceiverController {
    @Autowired
    private JsonHandlerClient jsonHandlerClient;

    @GetMapping("/webcall")
    public List<PromptDto> getPromptsRequest() {return jsonHandlerClient.getAllPrompts();}

    @GetMapping("/webcall/{id}")
    public PromptDto getPromptRequest(@PathVariable Long id) {return jsonHandlerClient.getPromptById(id);}

    @PostMapping("/webcall")
    public PromptDto createPromptRequest(@RequestBody PromptDto promptDto) {return jsonHandlerClient.createPrompt(promptDto);}

    @PutMapping("/webcall/{id}")
    PromptDto updatePromptRequest(@PathVariable Long id, @RequestBody PromptDto promptDto) {return jsonHandlerClient.updatePrompt(id, promptDto);}

    @DeleteMapping("/webcall/{id}")
    void deletePromptRequest(@PathVariable Long id){jsonHandlerClient.deletePrompt(id);}


}
