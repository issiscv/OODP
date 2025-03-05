package com.sangwoon.kim.oodp.visitor.ex1;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getRadius() {
		return radius;
	}
}
