package com.dell.ems.system.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEmployee {

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
			String query = "insert into employee" + "(Full_Name, Email, Department,Salary)" + "values"
					+ "('Ravi Kiran', 'ravi.kiran@gmail.com','Professor',765.34),"
					+ "('Mike Jenson', 'mike.jenson@gmail.com','Writer',478779.78)";

			int rowAffected = stm.executeUpdate(query);

			if (rowAffected > 0)
				System.out.println(" No. of rows inserted : " + rowAffected);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// clean up
			// 5. close connection
			if (conn != null)
				conn.close();
			if (stm != null)
				stm.close();
		}
	}

}
