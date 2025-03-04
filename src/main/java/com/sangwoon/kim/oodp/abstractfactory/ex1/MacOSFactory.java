package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button cteateButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
