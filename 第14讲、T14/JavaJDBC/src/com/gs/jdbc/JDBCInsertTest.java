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
			conn.setAutoCommit(false); // ȡ��������Զ��ύ
			Statement stmt = conn.createStatement();
			// ������Ϊ�棬���ʾ����ֵΪResultSet��������������Ǽ٣����ʾ���ص���Ӱ�����������û�н��
			stmt.execute("insert into t_student(id, name, age) values(1, 'test', 20)"); // ���£����룬ɾ��
			if (stmt.getUpdateCount() == 1) { // ��ȡ���µ�����
				System.out.println("����ɹ�");
			}
			conn.rollback(); // �ع�������֮ǰ��״̬
			conn.commit(); // �ύ��һ���ύ�ˣ����ݿ�Ż������޸�
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
