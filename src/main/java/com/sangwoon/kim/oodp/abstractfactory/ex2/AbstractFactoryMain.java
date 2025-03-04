package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		DatabaseClient mysqlClient = new DatabaseClient(new MySQLFactory());
		mysqlClient.performDatabaseOperations();

		System.out.println("\nSwitching to PostgreSQL...\n");

		DatabaseClient postgreClient = new DatabaseClient(new PostgreSQLFactory());
		postgreClient.performDatabaseOperations();

	}

}
