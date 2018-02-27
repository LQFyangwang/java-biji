package com.gs.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest extends BaseJDBC {
	
	public void jdbc() {
		// 根据指定的驱动程序类的全限定名来加载数据库驱动（实质是在创建SQLServerDriver类的）
				try {
					getConn();
					Statement stmt = conn.createStatement(); // 创建Statement对象，此对象用来把sql语句发送到数据库服务器
					ResultSet rs = stmt.executeQuery("select * from t_student"); // 发送sql语句到数据库服务 端，并且数据库服务端执行完该 sql语句后把数据返回
					while (rs.next()) { 
						int id = rs.getInt(1);
						String name = rs.getString("name"); // 直接通过字段名称来获取值
						int age = rs.getInt("age");
						System.out.println(id + "\t" + name + "\t" + age);
					}
					rs.close();
					stmt.close();
					close();
				} catch (SQLException e) { // 数据库异常：没办法创建连接，查询数据库时数据库报错
					e.printStackTrace();
				}
	}
	
	public static void main(String[] args) {
		
	}

}
