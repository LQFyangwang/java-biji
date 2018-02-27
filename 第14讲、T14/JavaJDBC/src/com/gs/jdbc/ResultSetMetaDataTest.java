package com.gs.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class ResultSetMetaDataTest extends BaseJDBC {

	public void getResultSetMetaData() {
		getConn();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from t_student");
			ResultSetMetaData rsmd = rs.getMetaData(); // ��ȡResultSet����Ӧ�����ݱ��Ԫ����
			System.out.println(rsmd.getColumnCount()); // ��ȡ���ж��ٸ��ֶ�
			System.out.println(rsmd.getColumnTypeName(1)); // ��ȡ�Զ��ֶε���������
			System.out.println(rsmd.getColumnName(2)); // ��ȡ�ֶε�����
			System.out.println(rsmd.getColumnClassName(1));
			System.out.println(rsmd.getTableName(1)); // ������  �� ""
			System.out.println(rsmd.getSchemaName(1)); // ���ݿ����ƻ� "" 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}
	
	
	@Test
	public void testRun() {
		getResultSetMetaData();
	}
	
}
