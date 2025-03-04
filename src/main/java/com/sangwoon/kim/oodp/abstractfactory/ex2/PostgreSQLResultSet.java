package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class PostgreSQLResultSet implements ResultSet {

	@Override
	public void getResults() {
		System.out.println("Getting results from PostgreSQL database");
	}
}
