package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class MySQLCommand implements Command {

	@Override
	public void execute(String query) {
		System.out.println("Executing MySQL query: " + query);
	}
}
