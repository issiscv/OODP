package com.sangwoon.kim.oodp.factorymethod.ex1;

public abstract class VehicleFactory {

	abstract Vehicle createVehicle();

	public void deliverVehicle() {
		Vehicle vehicle = createVehicle();
		System.out.println("Delivering the vehicle:");
		vehicle.drive();
	}

}
