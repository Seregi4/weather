package com.exampleProgect.weather.dto;
//{"coord":{"lon":23.8258,"lat":53.6884},
// "weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],
// "base":"stations",
// "main":{"temp":13.25,"feels_like":12.54,"temp_min":13.25,"temp_max":13.25,"pressure":1025,"humidity":73,"sea_level":1025,"grnd_level":1009},
// "visibility":10000,"wind":{"speed":0.84,"deg":30,"gust":1.88},
// "clouds":{"all":83},
// "dt":1684000435,
// "sys":{"country":"BY","sunrise":1683944851,"sunset":1684001682},
// "timezone":10800,"id":627904,"name":"Hrodna","cod":200}

import java.util.List;

public class WeatherNow {
    private Main main;
    private List<Weather> weather;

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}