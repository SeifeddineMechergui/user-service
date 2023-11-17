package com.dev.userservice;

import com.dev.userservice.dao.UserRepository;
import com.dev.userservice.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User(null, "Seifeddine", "seifeddine@yahoo;com"));
			userRepository.findAll().forEach(System.out::println);
		};
	}
}
