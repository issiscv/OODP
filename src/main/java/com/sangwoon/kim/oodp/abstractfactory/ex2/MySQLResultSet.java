package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class MySQLResultSet implements ResultSet {

	@Override
	public void getResults() {
		System.out.println("Getting results from MySQL database");
	}
}
