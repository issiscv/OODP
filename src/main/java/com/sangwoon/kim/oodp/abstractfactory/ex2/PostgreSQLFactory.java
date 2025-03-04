package com.sangwoon.kim.oodp.abstractfactory.ex2;

public class PostgreSQLFactory implements DatabaseFactory {

	@Override
	public Connection createConnection() {
		return new PostgreSQLConnection();
	}

	@Override
	public Command createCommand() {
		return new PostgreSQLCommand();
	}

	@Override
	public ResultSet createResultSet() {
		return new PostgreSQLResultSet();
	}
}
