package com.sangwoon.kim.oodp.singleton;

public class TextField {

	private String text;

	public TextField(String text) {
		this.text = text;
	}

	public void display() {
		String themeColor = Theme.getInstance().getThemeColor();
		System.out.println(
				"TextField [" + text + "] displayed in " + themeColor + " theme."
		);
	}

}
