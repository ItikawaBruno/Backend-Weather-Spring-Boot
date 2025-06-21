package com.api.weather.Weather.tempo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVento(@JsonAlias("speed") Double velocidade) {
}
