package com.wyf.tea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@SpringBootConfiguration
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
}
