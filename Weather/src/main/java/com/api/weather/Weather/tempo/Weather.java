package com.api.weather.Weather.tempo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Weather (@JsonAlias("main")DadosTemp dadosTemps,
                       @JsonAlias("weather")List<DadosDescricao> dadosDescricao,
                       @JsonAlias("wind")DadosVento dadosVento){
}
