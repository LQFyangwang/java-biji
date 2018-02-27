package com.gs.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gs.bean.Student;

public class StudentDAOImpl extends AbstractBaseDAO implements StudentDAO {

	@Override
	public Student queryById(Serializable id) {
		getConn();
		Student stu = null;
		try {
			PreparedStatement ps = conn.prepareStatement("select * from t_stu where id = ?");
			ps.setInt(1, (Integer) id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				stu = new Student();
				stu.setId((Integer) id);
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return stu;
	}

	@Override
	public List<Student> queryAll() {
		getConn();
		List<Student> stus = new ArrayList<Student>();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from t_stu");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				stus.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return stus;
	}

	@Override
	public void add(Student t) {
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into t_stu(name, age) values(?, ?)");
			ps.setString(1, t.getName());
			ps.setInt(2, t.getAge());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}

	@Override
	public void update(Student t) {
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("update t_stu set name = ?, age = ? where id = ?");
			ps.setString(1, t.getName());
			ps.setInt(2, t.getAge());
			ps.setInt(3, t.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}

	@Override
	public void delete(Serializable id) {
		getConn();
		// «Î÷±Ω”≤Œ’’update
		close();
	}
}
