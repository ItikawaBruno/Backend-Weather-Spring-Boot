package com.api.weather.Weather.service;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    @Value("${API_KEY_WEATHER}")
    private String apiKey;

    public String consumirApi(String nome){
		String url = "https://api.openweathermap.org/data/2.5/weather?q="+nome+"&appid="+"70e846a32a19f922a9d17b0d8b4b2f17";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response=client
            .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }

}
