package com.example.peerheavenbackend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class GlobalCorsConfig extends WebMvcConfigurerAdapter {

    @Value("${app.allowed.origin}")
    private String origin;
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")
                .allowedOrigins(origin)
                .allowedMethods("GET","POST","PUT","DELETE")
                .maxAge(50000);
    }
}
