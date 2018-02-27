package com.gs.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.gs.bean.User;

public class UserDAOImpl extends AbstractBaseDAO implements UserDAO {

	@Override
	public User queryById(Serializable id) {
		getConn();
		
		close();
		return null;
	}

	@Override
	public List<User> queryAll() {
		getConn();
		
		close();
		return null;
	}

	@Override
	public void add(User t) {
		getConn();
		
		close();
	}

	@Override
	public void update(User t) {
		getConn();
		
		close();
	}

	@Override
	public void delete(Serializable id) {
		getConn();
		
		close();
	}

	@Override
	public User queryEmailPwd(String email, String pwd) {
		getConn();
		User user = null;
		try {
			PreparedStatement ps = conn.prepareStatement("select * from t_user where email = ? and pwd = ?");
			ps.setString(1, email);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(email);
				user.setPwd(pwd);
				user.setPhone(rs.getString("phone"));
				user.setAge(rs.getInt("age"));
				user.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return user;
	}

}
