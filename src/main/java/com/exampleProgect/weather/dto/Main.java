package com.exampleProgect.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private Integer temp;

    @JsonProperty("feels_like")
    private Integer feelsLike;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }
}