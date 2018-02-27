package com.gs.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest extends BaseJDBC {
	
	public void jdbc() {
		// ����ָ���������������ȫ�޶������������ݿ�������ʵ�����ڴ���SQLServerDriver��ģ�
				try {
					getConn();
					Statement stmt = conn.createStatement(); // ����Statement���󣬴˶���������sql��䷢�͵����ݿ������
					ResultSet rs = stmt.executeQuery("select * from t_student"); // ����sql��䵽���ݿ���� �ˣ��������ݿ�����ִ����� sql��������ݷ���
					while (rs.next()) { 
						int id = rs.getInt(1);
						String name = rs.getString("name"); // ֱ��ͨ���ֶ���������ȡֵ
						int age = rs.getInt("age");
						System.out.println(id + "\t" + name + "\t" + age);
					}
					rs.close();
					stmt.close();
					close();
				} catch (SQLException e) { // ���ݿ��쳣��û�취�������ӣ���ѯ���ݿ�ʱ���ݿⱨ��
					e.printStackTrace();
				}
	}
	
	public static void main(String[] args) {
		
	}

}
