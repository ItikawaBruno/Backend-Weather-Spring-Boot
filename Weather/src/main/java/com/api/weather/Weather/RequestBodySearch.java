package com.api.weather.Weather;

public class RequestBodySearch {

    private String name;

    public RequestBodySearch(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
