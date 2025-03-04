package com.sangwoon.kim.oodp.observer.ex1;

public class NewsChannel implements Observer {

	private String name;

	public NewsChannel(String name) {
		this.name = name;
	}

	@Override
	public void update(String news) {
		System.out.println(name + " received news: " + news);
	}
}
