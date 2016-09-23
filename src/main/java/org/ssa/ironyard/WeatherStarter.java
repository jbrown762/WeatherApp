package org.ssa.ironyard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherStarter 
{
    static Logger LOGGER = LogManager.getLogger(WeatherStarter.class);

    public static void main(String[] args)
    {
        LOGGER.info("Starting application");
        SpringApplication.run(WeatherStarter.class, args);
    }
}