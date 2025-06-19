package com.vish.hinge_ai_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class HingeAiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HingeAiBackendApplication.class, args);
	}

}
