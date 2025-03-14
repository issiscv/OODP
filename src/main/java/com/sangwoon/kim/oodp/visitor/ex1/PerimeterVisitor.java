package com.sangwoon.kim.oodp.visitor.ex1;

public class PerimeterVisitor implements Visitor {

	@Override
	public void visit(Circle circle) {
		double perimeter = 2 * Math.PI * circle.getRadius();
		System.out.println("Circle Perimeter: " + perimeter);
	}

	@Override
	public void visit(Rectangle rectangle) {
		double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
		System.out.println("Rectangle Perimeter: " + perimeter);
	}
}
