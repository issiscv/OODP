package com.sangwoon.kim.oodp.bridge.ex2;

public class SMSSender implements MessageSender {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS with message: " + message);
	}
}
