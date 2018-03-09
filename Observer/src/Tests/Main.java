package Tests;

import Displays.CurrentConditions;
import Utils.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        weatherData.setMeasurments(80, 65, 30.4f);

    }
}
