package com.landingpage.landingpageapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LandingpageappApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LandingpageappApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(LandingpageappApplication.class, args);
	}

}
