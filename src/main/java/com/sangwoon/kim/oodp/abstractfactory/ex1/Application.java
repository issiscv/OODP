package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class Application {

	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		this.button = factory.cteateButton();
		this.checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}

}
