package org.ssa.ironyard.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.ssa.ironyard.WeatherStarter;
import org.ssa.ironyard.model.WeatherObj;
import org.ssa.ironyard.service.WeatherService;
import org.ssa.ironyard.service.WeatherServiceImpl;

@Controller
@RequestMapping("/weather")
public class WeatherController {

  //  static final Logger LOGGER = LogManager.getLogger(WeatherStarter.class);
    
    @Autowired
    WeatherService service;
        
    
    @RequestMapping(value = "")
    public String home()
    {
        return "Weather.html";     
    }
    
    @RequestMapping(produces = "application/json", value ="/{zipcode}", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getForecast(@PathVariable String zipcode)
    {
        
        service = new WeatherServiceImpl();
        
        return service.getWeather(zipcode);

    }
    

    
}
