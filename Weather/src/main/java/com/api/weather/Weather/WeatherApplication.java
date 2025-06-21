package com.api.weather.Weather;

import com.api.weather.Weather.service.ConsumoAPI;
import com.api.weather.Weather.service.ConverteDados;
import com.api.weather.Weather.tempo.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class WeatherApplication{


    public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

//	private final RepositoryTempo repositoryTempo;

//	@Override
//	public void run(String... args) throws Exception {
//
//		ConsumoAPI consumir = new ConsumoAPI();
//
//		String nome = "São Paulo";
//		nome = URLEncoder.encode(nome, StandardCharsets.UTF_8);
//		String json = consumir.consumirApi(url);
//		System.out.println(json);
//		ConverteDados converter = new ConverteDados();
//		Weather weather = converter.convertendoDados(json,Weather.class);
//		Tempo tempo = new Tempo(weather);
//		System.out.println(tempo);
//		repositoryTempo.save(tempo);
//	}

}
