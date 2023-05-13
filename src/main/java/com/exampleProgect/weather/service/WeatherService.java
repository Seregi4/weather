package com.exampleProgect.weather.service;

import com.exampleProgect.weather.dto.WeatherNow;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final String WEATHER = "https://api.openweathermap.org/data/2.5/weather?q=grodno&appid=a3031ace3f97c8fa098a87c8385f58e0&units=metric";
    public static WeatherNow getWeatherByCity(String city){
        String urlByCity = WEATHER.replace("grodno",city);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherNow> weatherResponseEntity =
                restTemplate.getForEntity(urlByCity, WeatherNow.class);
        WeatherNow weatherNow = weatherResponseEntity.getBody();

        assert weatherNow != null;
        return weatherNow;

    }
}
