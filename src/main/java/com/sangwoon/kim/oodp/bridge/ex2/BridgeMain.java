package com.sangwoon.kim.oodp.bridge.ex2;

public class BridgeMain {

	public static void main(String[] args) {
		MessageSender emailSender = new EmailSender();
		MessageSender smsSender = new SMSSender();

		Message textMessage = new TextMessage(emailSender);
		textMessage.send("Hello World!");

		Message encryptedMessage = new EncryptedMessage(smsSender);
		encryptedMessage.send("Hello World!");
	}

}
