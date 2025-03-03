package com.sangwoon.kim.oodp.bridge.ex1;

public class BridgeMain {

	public static void main(String[] args) {
		Device tv = new TV();
		BasicRemote basicRemote = new BasicRemote(tv);
		basicRemote.power();
		basicRemote.volumeDown();

		System.out.println();

		Device radio = new Radio();
		AdvancedRemote advancedRemote = new AdvancedRemote(radio);
		advancedRemote.power();
		advancedRemote.mute();
	}

}
