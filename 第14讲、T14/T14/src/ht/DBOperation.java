package ht;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 操作数据库的例子
 *
 */
public class DBOperation {
	public static void main(String[] args) throws Exception 
	{
		//加载驱动程序类
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//获取数据库连接
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=HT201403";
		String usr = "sa";
		String pwd = "ht2014";
		Connection conn = DriverManager.getConnection(url, usr, pwd);
		
		Statement st = conn.createStatement(); //获取一个陈述对象，用来执行SQL语句
		//执行一个创建表的语句
		st.execute("create table Student(num int not null, name varchar(30), age int, address varchar(50))");
		
		//往数据库里面添加数据
		st.execute("insert into Student(num, name, age, address) values(1, '张三', 20, '江西赣州')");
		st.execute("insert into Student(num, name, age, address) values(2, '李四', 21, '江西九江')");
		st.execute("insert into Student(num, name, age, address) values(3, '王五', 22, '江西吉安')");
		st.execute("insert into Student(num, name, age, address) values(4, '赵六', 23, '江西新干')");
		
		//修改数据库记录
		st.executeUpdate("update Student set name='黄七' where num=2");
		
		//删除数据库记录
		st.executeUpdate("delete from Student where num=4");
		
		//查询数据库
		ResultSet rs = st.executeQuery("select * from Student");
		while(rs!=null && rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String address = rs.getString("address");
			System.out.println("学号="+num+" 姓名="+name+" 年龄="+age+" 家庭住址="+address);
		}
		
		st.close(); //关闭陈述语句
		conn.close(); //关闭数据连接
	}
}
