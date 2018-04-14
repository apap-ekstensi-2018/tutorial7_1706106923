package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tutorial51706106923Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial51706106923Application.class, args);
	}
	
	@Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
}
