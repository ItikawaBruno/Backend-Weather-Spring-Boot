package com.api.weather.Weather.service;

import com.api.weather.Weather.tempo.Tempo;
import com.api.weather.Weather.tempo.Weather;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    public Tempo search(String city){
        String json = consumoAPI.consumirApi(city);
        System.out.println(json);
        ConverteDados converteDados = new ConverteDados();
        Weather weather = converteDados.convertendoDados(json, Weather.class);
        Tempo tempo = new Tempo(weather);
        return tempo;
    }

}
