package com.sangwoon.kim.oodp.factorymethod.ex1;

public class MotorcycleFactory extends VehicleFactory {

	@Override
	Vehicle createVehicle() {
		return new MotorCycle();
	}
}
