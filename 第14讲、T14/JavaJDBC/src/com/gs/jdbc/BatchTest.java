package com.gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class BatchTest {
	
	@Test
	public void testBatchInsert() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			Statement stmt = conn.createStatement();
			for (int i = 0; i < 50000; i++) {
				// 每一次for循环都要发送sql语句，此时发送sql语句需要一定的时间
				stmt.execute("insert into t_student values(" + (4 + i) + ", 'aa', 20)");
			}
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBatchInsert1() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			Statement stmt = conn.createStatement();
			for (int i = 0; i < 50000; i++) {
				stmt.addBatch("insert into t_student values(" + (104 + i) + ", 'aa', 20)"); // 每一次for循环只是添加一条sql语句，而不会发送sql语句。所有sql语句都添加完后再一次性地把所有语句发送到数据库服务器
			}
			stmt.executeBatch(); // 批量执行之前添加的所有sql语句
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
