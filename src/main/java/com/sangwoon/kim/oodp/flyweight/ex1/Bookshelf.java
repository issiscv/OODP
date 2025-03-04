package com.sangwoon.kim.oodp.flyweight.ex1;

import java.util.HashMap;
import java.util.Map;

public class Bookshelf {

	private static final Map<String, Book> bookShelf = new HashMap<>();

	public static Book getBook(String title) {
		Book book = bookShelf.get(title);

		if (book == null) {
			book = new Book(title);
			bookShelf.put(title, book);
			System.out.println(
					"Adding a new book to the bookshelf: " + title
			);
		} else {
			System.out.println(
					"Reusing existing book from the bookshelf: " + title
			);
		}
		return book;
	}


}
