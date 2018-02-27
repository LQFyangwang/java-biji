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
			ResultSetMetaData rsmd = rs.getMetaData(); // 获取ResultSet所对应的数据表的元数据
			System.out.println(rsmd.getColumnCount()); // 获取共有多少个字段
			System.out.println(rsmd.getColumnTypeName(1)); // 获取自定字段的数据类型
			System.out.println(rsmd.getColumnName(2)); // 获取字段的名称
			System.out.println(rsmd.getColumnClassName(1));
			System.out.println(rsmd.getTableName(1)); // 表名称  或 ""
			System.out.println(rsmd.getSchemaName(1)); // 数据库名称或 "" 
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
