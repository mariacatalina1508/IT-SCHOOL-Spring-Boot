package com.itschool.project.services;

import com.itschool.project.models.Weather;

import java.io.IOException;

public interface WeatherService {

    Weather getCityWeather(String city) throws IOException;
}