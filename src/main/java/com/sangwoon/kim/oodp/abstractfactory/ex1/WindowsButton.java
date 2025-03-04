package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Rendering a button in Windows style");
	}
}
