package com.wcode.exemple_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {

		Connection connection = null;

		connection = ConnectionFactory.getConnection();

		// try {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		// System.out.println("Driver loaded!");
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		//
		// try {
		// connection =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/codejdbc?serverTimezone=UTC",
		// "root",
		// "wmdm");
		// System.out.println("Stabilized conection!");
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
	}
}
