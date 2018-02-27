package com.qq.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractBaseDAO {
	
	protected Connection conn;
	
	public void getConn() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Java∑¥…‰
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=d_qq", "sa", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
