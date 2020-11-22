package com.example.peerheavenbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PeerheavenbackendApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(PeerheavenbackendApplication.class, args);
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(PeerheavenbackendApplication.class);
	    }

	

}
