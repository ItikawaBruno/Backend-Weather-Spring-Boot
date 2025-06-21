package com.api.weather.Weather.tempo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemp(@JsonAlias("temp") Double tempNow,
                        @JsonAlias("temp_min") Double tempMin,
                        @JsonAlias("temp_max") Double tempMax,
                        @JsonAlias("humidity") Double humidity) {
}
