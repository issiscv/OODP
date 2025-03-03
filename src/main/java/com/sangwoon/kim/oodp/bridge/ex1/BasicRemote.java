package com.sangwoon.kim.oodp.bridge.ex1;

public class BasicRemote extends Remote {

	public BasicRemote(Device device) {
		super(device);
	}

	@Override
	public void power() {
		if (device.isEnabled()) {
			device.turnOff();
		} else {
			device.turnOn();
		}
	}
}
