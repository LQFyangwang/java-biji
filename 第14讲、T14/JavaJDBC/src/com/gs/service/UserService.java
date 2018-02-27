package com.gs.service;

import com.gs.bean.User;

public interface UserService extends BaseService<User>{
	public User queryEmailPwd(String email, String pwd);
}
