package com.sangwoon.kim.oodp.observer.ex2;

public class StatisticsDisplay implements WeatherObserver {

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println(
				"Avg/Max/Min temp: " + temp + "/" + (temp + 2) + "/" + (temp - 2)
		);
	}
}
