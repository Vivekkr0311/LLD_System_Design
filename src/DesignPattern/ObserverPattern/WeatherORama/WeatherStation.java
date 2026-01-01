package DesignPattern.ObserverPattern.WeatherORama;

import DesignPattern.ObserverPattern.WeatherORama.Observers.CurrentConditionsDisplay;
import DesignPattern.ObserverPattern.WeatherORama.Observers.ForecastDisplay;
import DesignPattern.ObserverPattern.WeatherORama.Observers.HeatIndexDisplay;
import DesignPattern.ObserverPattern.WeatherORama.Observers.StatisticsDisplay;
import DesignPattern.ObserverPattern.WeatherORama.Subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
