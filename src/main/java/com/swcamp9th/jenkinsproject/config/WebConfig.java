package com.swcamp9th.jenkinsproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
////            .allowedOrigins("http://localhost:5173")
//            .allowedOrigins("http://localhost:30000")
//            .allowedMethods("GET", "POST", "PUT", "DELETE");
//    }
}
