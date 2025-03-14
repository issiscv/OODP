package com.sangwoon.kim.oodp.bridge.ex1;

public abstract class Remote {

	protected Device device;

	protected Remote(Device device) {
		this.device = device;
	}

	public abstract void power();

	public void volumeUp() {
		device.setVolume(device.isEnabled() ? 1 : 0);
	}

	public void volumeDown() {
		device.setVolume(device.isEnabled() ? -1 : 0);
	}

}
