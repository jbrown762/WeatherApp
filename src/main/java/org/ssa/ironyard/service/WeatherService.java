package org.ssa.ironyard.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.ssa.ironyard.model.WeatherObj;

@Component
public interface WeatherService
{
            
    List<String> getWeather(String zipcode);

    
}
