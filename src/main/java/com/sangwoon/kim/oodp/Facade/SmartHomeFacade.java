package com.sangwoon.kim.oodp.Facade;

public class SmartHomeFacade {

	private Thermostat thermostat;
	private Lights lights;
	private CoffeMaker coffeMaker;

	public SmartHomeFacade(Thermostat thermostat, Lights lights, CoffeMaker coffeMaker) {
		this.thermostat = thermostat;
		this.lights = lights;
		this.coffeMaker = coffeMaker;
	}

	public void wakeUp() {
		System.out.println("Waking up...");
		thermostat.setTemperature(22);
		lights.on();
		coffeMaker.brewCoffee();
	}

	public void leaveHome() {
		System.out.println("Leaving home...");
		thermostat.setTemperature(10);
		lights.off();
	}

}
