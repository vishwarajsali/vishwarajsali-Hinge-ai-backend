package com.vish.hinge_ai_backend.conversations;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConversationController {

    @Autowired
    private  ConversationService conversationService;

    @PostMapping("/conversation")
    public Conversation createNewConversation(@RequestBody CreateConversationRequest request){

        return conversationService.newConversation(request.profileId());
    }



    @GetMapping("/conversation")
    public List<Conversation> getAllConversation(){

        return conversationService.findAllConversation();
    }
}
