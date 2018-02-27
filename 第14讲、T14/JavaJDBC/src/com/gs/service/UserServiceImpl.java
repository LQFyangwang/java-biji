package com.gs.service;

import java.io.Serializable;
import java.util.List;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import com.gs.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}
	
	
	@Override
	public User queryById(Serializable id) {
		return userDAO.queryById(id);
	}

	@Override
	public List<User> queryAll() {
		return userDAO.queryAll();
	}

	@Override
	public void add(User t) {
		if (t.getEmail() == null || t.getEmail().equals("")) {
			System.out.println("不能添加数据");
		} else {
			userDAO.add(t);
		}
	}

	@Override
	public void update(User t) {
		userDAO.update(t);
	}

	@Override
	public void delete(Serializable id) {
		userDAO.delete(id);
	}


	@Override
	public User queryEmailPwd(String email, String pwd) {
		return userDAO.queryEmailPwd(email, pwd);
	}

}
