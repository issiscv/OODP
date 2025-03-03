package com.sangwoon.kim.oodp.factorymethod.ex1;

public class CarFactory extends VehicleFactory {

	@Override
	Vehicle createVehicle() {
		return new Car();
	}
}
