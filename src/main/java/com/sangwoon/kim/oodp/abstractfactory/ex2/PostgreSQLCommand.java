package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class PostgreSQLCommand implements Command {

	@Override
	public void execute(String query) {
		System.out.println("Executing PostgreSQL query: " + query);
	}
}
