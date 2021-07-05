package com.amdocs.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection conn = null;

	private DBUtil() {
	}

	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/dbname";
		String user = "root";
		String password = "password";
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(url, user, password);
				return conn;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return null;
	}

}
