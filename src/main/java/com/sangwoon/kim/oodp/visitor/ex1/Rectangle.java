package com.sangwoon.kim.oodp.visitor.ex1;

public class Rectangle implements Shape {

	double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}
