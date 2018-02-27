package ht;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * �������ݿ������
 *
 */
public class DBOperation {
	public static void main(String[] args) throws Exception 
	{
		//��������������
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//��ȡ���ݿ�����
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=HT201403";
		String usr = "sa";
		String pwd = "ht2014";
		Connection conn = DriverManager.getConnection(url, usr, pwd);
		
		Statement st = conn.createStatement(); //��ȡһ��������������ִ��SQL���
		//ִ��һ������������
		st.execute("create table Student(num int not null, name varchar(30), age int, address varchar(50))");
		
		//�����ݿ������������
		st.execute("insert into Student(num, name, age, address) values(1, '����', 20, '��������')");
		st.execute("insert into Student(num, name, age, address) values(2, '����', 21, '�����Ž�')");
		st.execute("insert into Student(num, name, age, address) values(3, '����', 22, '��������')");
		st.execute("insert into Student(num, name, age, address) values(4, '����', 23, '�����¸�')");
		
		//�޸����ݿ��¼
		st.executeUpdate("update Student set name='����' where num=2");
		
		//ɾ�����ݿ��¼
		st.executeUpdate("delete from Student where num=4");
		
		//��ѯ���ݿ�
		ResultSet rs = st.executeQuery("select * from Student");
		while(rs!=null && rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String address = rs.getString("address");
			System.out.println("ѧ��="+num+" ����="+name+" ����="+age+" ��ͥסַ="+address);
		}
		
		st.close(); //�رճ������
		conn.close(); //�ر���������
	}
}
