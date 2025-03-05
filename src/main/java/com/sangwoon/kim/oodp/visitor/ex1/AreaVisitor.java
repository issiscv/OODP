package com.sangwoon.kim.oodp.visitor.ex1;

public class AreaVisitor implements Visitor {

	@Override
	public void visit(Circle circle) {
		double area = Math.PI * circle.getRadius() * circle.getRadius();
		System.out.println("Circle Area: " + area);
	}

	@Override
	public void visit(Rectangle rectangle) {
		double area = rectangle.width * rectangle.getHeight();
		System.out.println("Rectangle Area: " + area);
	}
}
