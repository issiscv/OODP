package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class MySQLFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new MySQLConnection();
	}

	@Override
	public Command createCommand() {
		return new PostgreSQLCommand();
	}

	@Override
	public ResultSet createResultSet() {
		return new MySQLResultSet();
	}
}
