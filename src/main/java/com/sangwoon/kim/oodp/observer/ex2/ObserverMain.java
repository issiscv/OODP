package com.sangwoon.kim.oodp.observer.ex2;

public class ObserverMain {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		WeatherObserver currentConditionDisplay = new CurrentConditionDisplay();
		WeatherObserver statisticsDisplay = new StatisticsDisplay();
		WeatherObserver forecastDisplay = new ForecastDisplay();

		weatherData.registerObserver(currentConditionDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(forecastDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);

	}

}
