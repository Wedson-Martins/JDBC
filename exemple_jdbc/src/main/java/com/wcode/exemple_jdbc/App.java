package com.wcode.exemple_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.wcode.exemple_jdbc.connection.ConnectionFactory;
import com.wcode.exemple_jdbc.model.Car;

public class App {
	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		// INSERT------------------------------------------------------
		// String sql = "insert into cars(model) value(?)";
		// PreparedStatement stmt = connection.prepareStatement(sql);
		// stmt.setString(1, "Virtus");
		// stmt.executeUpdate();
		// INSERT------------------------------------------------------

		// FindAll------------------------------------------------------
		// String sql = "Select * from cars";
		//
		// Statement stmt = connection.createStatement();
		// ResultSet rs = stmt.executeQuery(sql);
		//
		// List<Car> cars = new ArrayList<Car>();
		//
		// while (rs.next()) {
		// Car car = new Car();
		// car.setId(rs.getLong(1));
		// car.setModel(rs.getString(2));
		// cars.add(car);
		// }
		// cars.forEach(c -> System.out.println(c));
		// FindAll------------------------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert id: ");
		Long id = scanner.nextLong();

		String sql = "select * from cars where id = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setLong(1, id);
		ResultSet rs = stmt.executeQuery();

		Car car = new Car();

		while (rs.next()) {
			car.setId(rs.getLong(1));
			car.setModel(rs.getString(2));
		}

		System.out.println(car);

	}
}
