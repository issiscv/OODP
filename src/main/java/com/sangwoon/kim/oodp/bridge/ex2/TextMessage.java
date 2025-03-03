package com.sangwoon.kim.oodp.bridge.ex2;

public class TextMessage extends Message{

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send(String message) {
		messageSender.sendMessage("Text Message: " + message);
	}
}
