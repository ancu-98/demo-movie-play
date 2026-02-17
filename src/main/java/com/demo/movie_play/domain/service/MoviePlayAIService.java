package com.demo.movie_play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MoviePlayAIService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestion de Películas {{platform}}.
            Usa menos de 120 caracteres y hazlo en un tono amable y extrovertido.
            """)
    String generateGretting(@V("platform") String platform);
}
