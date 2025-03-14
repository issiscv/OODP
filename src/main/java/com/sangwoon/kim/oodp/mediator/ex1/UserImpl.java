package com.sangwoon.kim.oodp.mediator.ex1;

public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + ": Sending Message = " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(
				this.name + " Received Message = " + message
		);
	}
}
