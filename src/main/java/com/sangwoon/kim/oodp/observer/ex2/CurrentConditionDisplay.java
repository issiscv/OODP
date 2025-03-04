package com.sangwoon.kim.oodp.observer.ex2;

public class CurrentConditionDisplay implements WeatherObserver {

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println(
				"Current: " + temp + "F, " + humidity + "% humidity"
		);
	}
}
