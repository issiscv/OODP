package com.sangwoon.kim.oodp.abstractfactory.ex1;

public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Rendering a checkbox in MacOS style");
	}
}
