package com.sangwoon.kim.oodp.flyweight.ex1;

public class FlyweightMain {

	public static void main(String[] args) {
		Book book1 = Bookshelf.getBook("Effective Java");
		book1.read();

		Book book2 = Bookshelf.getBook("Effective Java");
		book2.read();

		Book book3 = Bookshelf.getBook("Clean Code");
		book3.read();

		System.out.println(
				book1 == book2
						? "Same book for 'Effective Java'."
						: "Different books for 'Effective Java'"
		);
	}

}
