package com.example.transaction_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permet l'accès à toutes les ressources ("/**")
        registry.addMapping("/**")
                // Autorise l'accès depuis "http://localhost:3000" (ton frontend)
                .allowedOrigins("http://localhost:3000")
                // Autorise les méthodes HTTP suivantes
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                // Autorise tous les en-têtes
                .allowedHeaders("*");
    }
}
