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
				// ÿһ��forѭ����Ҫ����sql��䣬��ʱ����sql�����Ҫһ����ʱ��
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
				stmt.addBatch("insert into t_student values(" + (104 + i) + ", 'aa', 20)"); // ÿһ��forѭ��ֻ�����һ��sql��䣬�����ᷢ��sql��䡣����sql��䶼��������һ���Եذ�������䷢�͵����ݿ������
			}
			stmt.executeBatch(); // ����ִ��֮ǰ��ӵ�����sql���
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
