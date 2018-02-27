package com.qq.service;

import java.util.List;

import com.qq.bean.Friends;
import com.qq.bean.QQAccount;

public interface FriendsService extends BaseService<Friends> {

	/**
	 * 根据自己的账号来获取自己的所有好友 
	 * @param no
	 */
	public List<QQAccount> queryByNo(String no);
}
