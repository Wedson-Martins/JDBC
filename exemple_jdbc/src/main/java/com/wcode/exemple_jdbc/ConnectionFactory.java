package com.wcode.exemple_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:mysql://localhost:3306?serverTimazene=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "wmdm";

	private static Connection connection = null;

	private static Connection createConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Drive");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	public static Connection getConnection() {
		createConnection();
		return connection;
	}

}
