package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		GUIFactory windowsFactory = new WindowsFactory();
		Application windowsApp = new Application(windowsFactory);
		windowsApp.paint();

		System.out.println();

		GUIFactory macOSFactory = new MacOSFactory();
		Application macApp = new Application(macOSFactory);
		macApp.paint();

	}
}
