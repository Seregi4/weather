package com.exampleProgect.weather.controllers;

import com.exampleProgect.weather.dto.WeatherNow;
import com.exampleProgect.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }


    @PostMapping("/")
    public String po(@RequestParam("someCity") String someCity, Model model) {

        WeatherNow weatherNow = WeatherService.getWeatherByCity(someCity);

        model.addAttribute("City",someCity);
        model.addAttribute("Temp",weatherNow.getMain().getTemp());
        model.addAttribute("FeelsLike",weatherNow.getMain().getFeelsLike());
        model.addAttribute("Main",weatherNow.getWeather().get(0).getMain()+ " "+ weatherNow.getWeather().get(0).getDescription());

        return "weather";
    }

}