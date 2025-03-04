package com.sangwoon.kim.oodp.abstractfactory.ex2;

public interface DatabaseFactory {

	Connection createConnection();
	Command createCommand();
	ResultSet createResultSet();

}
