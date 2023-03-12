package com.github.springbootnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/hello")
@RestController
public class SpringBootNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNativeApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("hi");
	}

}
