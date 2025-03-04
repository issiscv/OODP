package com.sangwoon.kim.oodp.observer.ex2;

public interface WeatherStation {

	void registerObserver(WeatherObserver o);
	void removeObserver(WeatherObserver o);
	void notifyObservers();
}
