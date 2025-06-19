package com.vish.hinge_ai_backend.profiles;


import com.vish.hinge_ai_backend.conversations.Conversation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public Profile newProfile(ProfileRequest profileRequest){


        Profile profile = new Profile(
                UUID.randomUUID().toString(),
                profileRequest.getFirstName(),
                profileRequest.getLastName(),
                profileRequest.getAge(),
                profileRequest.getEthnicity(),
                profileRequest.getGender(),
                profileRequest.getBio(),
                profileRequest.getImageUrl(),
                profileRequest.getMyersBriggsPersonalityType()
        );

        profileRepository.save(profile);
        log.info("Profile created: {}", profile);
        return profile;
    }

    public List<Profile> findAllProfiles(){
        return profileRepository.findAll();
    }

    public Profile deleteProfile(String profildId){

        Optional<Profile> profile = Optional.ofNullable(profileRepository.findById(profildId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));

        log.info("Profile deleted for: {}", profile);

        profileRepository.deleteById(profildId);

        return profile.get();
    }

}
