package com.api.weather.Weather.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://weather-spring-boot-2q6y.vercel.app") // USE A URL EXATA DO SEU FRONTEND VERIFIED
                        .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                        .allowCredentials(true) // Adicione esta linha
                        // .allowedHeaders("*"); // Opcional: comente temporariamente ou seja específico
                        .maxAge(3600); // Mantenha esta linha para requests pre-flight
            }
        };
    }
}