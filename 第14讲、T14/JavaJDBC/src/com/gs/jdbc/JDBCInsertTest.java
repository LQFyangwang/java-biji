package com.gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			conn.setAutoCommit(false); // 取消事务的自动提交
			Statement stmt = conn.createStatement();
			// 如果结果为真，则表示返回值为ResultSet结果集，如果结果是假，则表示返回的是影响的行数或者没有结果
			stmt.execute("insert into t_student(id, name, age) values(1, 'test', 20)"); // 更新，插入，删除
			if (stmt.getUpdateCount() == 1) { // 获取更新的行数
				System.out.println("插入成功");
			}
			conn.rollback(); // 回滚到插入之前的状态
			conn.commit(); // 提交，一旦提交了，数据库才会真正修改
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
