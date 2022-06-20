package com.office;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Akshay!!!!";

	}

	public static void main(String[] args) {
		SpringApplication.run(GitCicdActionsApplication.class, args);
	}

}
