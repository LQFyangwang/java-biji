package com.qq.service;

import java.util.List;

import com.qq.bean.Friends;
import com.qq.bean.QQAccount;

public interface FriendsService extends BaseService<Friends> {

	/**
	 * �����Լ����˺�����ȡ�Լ������к��� 
	 * @param no
	 */
	public List<QQAccount> queryByNo(String no);
}
