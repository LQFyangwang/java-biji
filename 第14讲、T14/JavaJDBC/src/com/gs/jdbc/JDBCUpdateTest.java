package com.gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=jdbc", "sa", "123456");
			Statement stmt = conn.createStatement();
			// ������Ϊ�棬���ʾ����ֵΪResultSet��������������Ǽ٣����ʾ���ص���Ӱ�����������û�н��
			stmt.execute("update t_student set name = 'test1' where id = 2"); // ���£����룬ɾ��
			if (stmt.getUpdateCount() == 1) { // ��ȡ���µ�����
				System.out.println("���³ɹ�");
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
