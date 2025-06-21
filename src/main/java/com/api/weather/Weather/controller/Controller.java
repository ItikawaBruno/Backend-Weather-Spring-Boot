package com.api.weather.Weather.controller;

import com.api.weather.Weather.RequestBodySearch;
import com.api.weather.Weather.service.ConsumoAPI;
import com.api.weather.Weather.service.ConverteDados;
import com.api.weather.Weather.service.Service;
import com.api.weather.Weather.tempo.Tempo;
import com.api.weather.Weather.tempo.Weather;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;



@RestController
@RequestMapping("/tempo")
public class Controller {

    private Service service = new Service();

    @PostMapping("/search")
    public Tempo search(@RequestBody RequestBodySearch requestBody){
        String nome = URLEncoder.encode(requestBody.getName(), StandardCharsets.UTF_8);
        return service.search(nome);
    }


//    @GetMapping("/test")
//    public String test(){
//        return "Está funcionando";
//    }

}
