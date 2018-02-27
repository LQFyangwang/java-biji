package com.gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			Statement stmt = conn.createStatement();
			// 如果结果为真，则表示返回值为ResultSet结果集，如果结果是假，则表示返回的是影响的行数或者没有结果
			stmt.execute("delete from t_student where id = 2"); // 更新，插入，删除
			if (stmt.getUpdateCount() ==1) { // 获取更新的行数
				System.out.println("更新成功");
			}
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
