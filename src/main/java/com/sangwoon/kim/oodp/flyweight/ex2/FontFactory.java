package com.sangwoon.kim.oodp.flyweight.ex2;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

	private static final Map<String, Font> fontMap = new HashMap<>();

	public static Font getFont(String font, int size, String color) {
		String key = font + size + color;
		Font fontObject = fontMap.get(key);

		if (fontObject == null) {
			fontObject = new ConcreteFont(font, size, color);
			fontMap.put(key, fontObject);
		} else {
			System.out.println("Reusing font: " + key);
		}
		return fontObject;
	}

}
