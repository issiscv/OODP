package com.sangwoon.kim.oodp.Facade;

public class FacadeMain {

	public static void main(String[] args) {
		Thermostat thermostat = new Thermostat();
		Lights lights = new Lights();
		CoffeMaker coffeMaker = new CoffeMaker();
		SmartHomeFacade smartHomeFacade = new SmartHomeFacade(thermostat, lights, coffeMaker);

		smartHomeFacade.wakeUp();
		smartHomeFacade.leaveHome();
	}

}
