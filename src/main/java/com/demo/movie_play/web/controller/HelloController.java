package com.demo.movie_play.web.controller;

import com.demo.movie_play.domain.service.MoviePlayAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String platform;
    private final MoviePlayAIService aiService;


    public HelloController(@Value("${spring.application.name}") String platform, MoviePlayAIService aiService){
        this.platform = platform;
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello(){
        // Mi APY Key de OpenAI supero la quota, pero el saludo funciona.
        // return this.aiService.generateGretting(platform)
        return "Bienvenido a " + platform;
    }
}
