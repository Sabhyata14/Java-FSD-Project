package com.dell.ems.system.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {

	static Connection conn = null;
	static Statement stm = null;
	static ResultSet rst = null;

	public static void main(String[] args) throws SQLException {

		try {
			// 1. get connection
			conn = DatabaseConnection.initConnection();

			// 2. create statement
			stm = conn.createStatement();

			// 3. execute Delete query
			String query = "delete from employee " + "where ID = 6";

			int rowAffected = stm.executeUpdate(query);

			if (rowAffected > 0)
				System.out.println(" No. of rows Affected : " + rowAffected);

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
