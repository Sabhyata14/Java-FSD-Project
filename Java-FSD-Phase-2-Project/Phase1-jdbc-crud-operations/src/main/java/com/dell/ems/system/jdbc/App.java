package com.dell.ems.system.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	// data-source properties
	static final String DBURL = "jdbc:mysql://localhost:3306/ems_system";
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		ResultSet rst = null;

		try {
			// 1. Registering jdbc driver
			Class.forName(JDBC_DRIVER);

			// 2. get connection
			conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);

			// 3. create jdbc statement
			stm = conn.createStatement();

			// 4. execute (eg: select query)
			String query = "select * from employee";
			rst = stm.executeQuery(query);

			// 5. print ResultSet
			printData(rst);
			if (conn != null)
				System.out.println("--- DB connection / Query execution Successfull !---");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("-- DB Connection Failure --");
			e.printStackTrace();
		} finally {
			// clean up
			// 6. close connection
			if (stm != null)
				stm.close();
			if (conn != null)
				conn.close();
			if (rst != null)
				rst.close();
		}
	}

	private static void printData(ResultSet rst) throws SQLException {
		while (rst.next()) {
			System.out.println("--------------------------");
			System.out.println("Id : " + rst.getInt("Id") + ", Name : " + rst.getString("Full_Name") + " , Email : "
					+ rst.getString("Email") + " , Department : " + rst.getString("Department") + " , Salary : "
					+ rst.getDouble("Salary"));
		}
	}
}
