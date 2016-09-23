package org.ssa.ironyard.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.ssa.ironyard.model.WeatherObj;

@Component
public class WeatherServiceImpl implements WeatherService
{

    @Override
    public List<String> getWeather(String zipcode) throws IllegalArgumentException
    {
        final String uri = "http://api.wunderground.com/api/5ed1094ef549d44b/conditions/q/" + zipcode + ".json";

        RestTemplate restTemplate = new RestTemplate();
        List<String> result = new ArrayList<>();
        result.add(restTemplate.getForObject(uri, String.class));

        return result;
    }


}
