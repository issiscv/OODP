package com.sangwoon.kim.oodp.visitor.ex1;

public class VisitorMain {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 6);

		Visitor areaVisitor = new AreaVisitor();
		Visitor perimeterVisitor = new PerimeterVisitor();

		System.out.println("Calculating Area:");

		circle.accept(areaVisitor);
		rectangle.accept(areaVisitor);

		System.out.println("Calculating Perimeter:");
		circle.accept(perimeterVisitor);
		rectangle.accept(perimeterVisitor);

	}

}
