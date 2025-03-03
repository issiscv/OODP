package com.sangwoon.kim.oodp.factorymethod.ex1;

public class FactoryMethodMain {

	public static void main(String[] args) {
		VehicleFactory carFactory = new CarFactory();
		carFactory.deliverVehicle();

		VehicleFactory motorcycleFactory = new MotorcycleFactory();
		motorcycleFactory.deliverVehicle();
	}

}
