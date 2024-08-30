package com.itschool.project.services;

import com.itschool.project.models.entities.Weather;

import java.io.IOException;

public interface WeatherService {

    Weather getCityWeather(String city) throws IOException;
}