package ht;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 * ��ȡ���ݿ����ӵ�����
 */
public class DBConnection {
	public static void main(String[] args) throws Exception 
	{
		//��������������
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//��ȡ���ݿ�����
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=HT201403";
		String usr = "sa";
		String pwd = "ht2014";
		Connection conn = DriverManager.getConnection(url, usr, pwd);
		
		//��ȡ���ݿ����ӵ�Ԫ����
		DatabaseMetaData dmt = conn.getMetaData();
		System.out.println(dmt.getDatabaseProductName()); 
		
		conn.close(); //�ǵùر����ݿ�����
	}
}
