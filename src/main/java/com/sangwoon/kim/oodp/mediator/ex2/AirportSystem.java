package com.sangwoon.kim.oodp.mediator.ex2;

public class AirportSystem {

	public static void main(String[] args) {
		AirportControlTower controlTower = new AirportControlTower();

		Flight flight1 = new Flight(controlTower, "KE123");
		Flight flight2 = new Flight(controlTower, "OZ456");
		Runway runway = new Runway(controlTower);

		flight1.land();
		flight2.land();
		runway.clear();
		flight2.land();

	}

}
