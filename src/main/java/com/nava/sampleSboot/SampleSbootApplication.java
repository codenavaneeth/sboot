package com.nava.sampleSboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSbootApplication.class, args);
	}

	
	@RequestMapping("/hello")
	public String sayHello() {
		return "HELLO";
	}
}
