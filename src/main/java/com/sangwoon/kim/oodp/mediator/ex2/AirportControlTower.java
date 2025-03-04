package com.sangwoon.kim.oodp.mediator.ex2;

public class AirportControlTower implements AirportMediator{

	private boolean isRunwayAvailable = true;

	public boolean isRunwayAvailable() {
		return isRunwayAvailable;
	}

	@Override
	public void setRunwayAvailability(boolean status) {
		isRunwayAvailable = status;
	}
}
