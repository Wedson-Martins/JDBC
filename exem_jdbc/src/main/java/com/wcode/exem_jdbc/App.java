package com.wcode.exem_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codejdbc?serverTimezone=UTC", "root",
					"wmdm");
			System.out.println("conected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
