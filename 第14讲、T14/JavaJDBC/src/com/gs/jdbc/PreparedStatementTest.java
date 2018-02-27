package com.gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {
	
	public static void update(int id, String name) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			PreparedStatement ps = conn.prepareStatement("update t_student set name = ? where id = ?");
			ps.setString(1, name);
			ps.setInt(2, id); // ���ã�����ʾ�Ĳ�������һ���ʺž��ǵ�һ������������������1��ʼ
			ps.execute();
			if (ps.getUpdateCount() == 1) {
				System.out.println("���³ɹ�");
			}
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		update(2, "aaaaa");
	}

}
