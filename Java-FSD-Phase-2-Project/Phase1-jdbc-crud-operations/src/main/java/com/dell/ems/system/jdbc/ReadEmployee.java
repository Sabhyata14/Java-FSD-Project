package com.dell.ems.system.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployee {

	static Connection conn = null;
	static Statement stm = null;
	static ResultSet rst = null;

	public static void main(String[] args) throws SQLException {

		try {
			// 1. get connection
			conn = DatabaseConnection.initConnection();

			// 2. create statement
			stm = conn.createStatement();

			// 3. execute query
			String query = "select * from employee";
			rst = stm.executeQuery(query);

			// print result set
			printData(rst);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				conn.close();
			if (stm != null)
				stm.close();
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
