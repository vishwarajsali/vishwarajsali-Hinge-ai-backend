package com.vish.hinge_ai_backend.profiles;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {


}
