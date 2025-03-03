package com.sangwoon.kim.oodp.bridge.ex1;

public class TV implements Device {

	private boolean on = false;
	private int volume;

	@Override
	public void turnOn() {
		on = true;
		System.out.println("TV is now ON.");
	}

	@Override
	public void turnOff() {
		on = false;
		System.out.println("TV is now OFF.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("TV volume set to " + volume);
	}

	@Override
	public boolean isEnabled() {
		return on;
	}

}
