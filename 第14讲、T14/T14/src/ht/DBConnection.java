package ht;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 * 获取数据库连接的例子
 */
public class DBConnection {
	public static void main(String[] args) throws Exception 
	{
		//加载驱动程序类
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//获取数据库连接
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=HT201403";
		String usr = "sa";
		String pwd = "ht2014";
		Connection conn = DriverManager.getConnection(url, usr, pwd);
		
		//获取数据库连接的元数据
		DatabaseMetaData dmt = conn.getMetaData();
		System.out.println(dmt.getDatabaseProductName()); 
		
		conn.close(); //记得关闭数据库连接
	}
}
