package org.ssa.ironyard.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherObj
{
    int zipcode;
    String city;
    String state;
    ArrayList<String> forecast;

    public void setForecast(List<String> forecast)
    {
        forecast.clear();
        for (String f : forecast)
            this.forecast.add(f);
    }

public ArrayList<String> getForecast()
{
    return forecast;
}
}
