package com.qq.service;

import java.io.Serializable;
import java.util.List;

import com.qq.bean.Friends;
import com.qq.bean.QQAccount;
import com.qq.dao.FriendsDAO;
import com.qq.dao.FriendsDAOImpl;

public class FriendsServiceImpl implements FriendsService {

	private FriendsDAO friendsDAO;
	
	public FriendsServiceImpl() {
		friendsDAO = new FriendsDAOImpl();
	}
	
	@Override
	public Friends queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Friends t) {
		friendsDAO.add(t);
	}

	@Override
	public void update(Friends t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Friends t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<QQAccount> queryByNo(String no) {
		return friendsDAO.queryByNo(no);
	}

}
