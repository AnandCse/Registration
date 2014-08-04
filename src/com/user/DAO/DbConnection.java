package com.user.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection implements DbConst {

	private DbConnection() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private Connection createConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);
			return connection;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static Connection getConnection() {
		return new DbConnection().createConnection();
	}
}
