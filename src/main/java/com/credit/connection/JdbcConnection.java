package com.credit.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public Connection getConnection() {
		Connection conn = null;
		 try {
			conn =DriverManager.getConnection("jdbc:mysql://localhost/test?" +
				                                   "user=root&password=Kpek3422");
		} catch (SQLException e) {
			System.out.println("Exception while creating connection"+e.getMessage());
		}
		return conn;
	}

}
