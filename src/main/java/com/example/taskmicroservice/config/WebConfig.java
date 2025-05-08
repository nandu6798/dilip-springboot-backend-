package com.example.taskmicroservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // This applies to all endpoints
                .allowedOrigins("http://react-svc.demo-project.svc.cluster.local:3000")  // Replace with the frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Adjust methods as necessary
                .allowedHeaders("*")  // Allow all headers, or specify if needed
                .allowCredentials(true);  // Allow sending credentials (cookies, etc.)
    }
}

