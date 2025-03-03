package com.sangwoon.kim.oodp.bridge.ex2;

public abstract class Message {

	protected MessageSender messageSender;

	protected Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public abstract void send(String message);

}
