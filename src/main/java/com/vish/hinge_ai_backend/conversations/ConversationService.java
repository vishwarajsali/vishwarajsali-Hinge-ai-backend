package com.vish.hinge_ai_backend.conversations;


import com.vish.hinge_ai_backend.profiles.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class ConversationService {

    @Autowired
    ConversationRepository conversationRepository;

    @Autowired
    ProfileRepository profileRepository;


    public Conversation newConversation(String profileId){
        profileRepository.findById(profileId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        log.info("New Conversation is created for {}", profileId);
        Conversation conversation = new Conversation(
                UUID.randomUUID().toString(),
                profileId,
                new ArrayList<>()
        );
        conversationRepository.save(conversation);
        log.info("Conversation is saved for {}: {}", profileId, conversation);

        return conversation;
    }

    public List<Conversation> findAllConversation(){
        return conversationRepository.findAll();
    }
}
