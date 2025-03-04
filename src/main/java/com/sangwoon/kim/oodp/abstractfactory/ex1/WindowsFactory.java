package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button cteateButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
