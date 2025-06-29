package com.api.weather.Weather.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConverteDados {

    private ObjectMapper mapper = new ObjectMapper();

    public <T>T convertendoDados(String json, Class<T> classe){
        try {
            return mapper.readValue(json,classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
