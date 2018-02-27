package com.gs.dao;

import com.gs.bean.User;

public interface UserDAO extends BaseDAO<User>{
	
	public User queryEmailPwd(String email, String pwd);
	
}
