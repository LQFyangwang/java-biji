package com.qq.dao;

import java.util.List;

import com.qq.bean.Friends;
import com.qq.bean.QQAccount;

public interface FriendsDAO extends BaseDAO<Friends>{

	/**
	 * �����Լ����˺�����ȡ�Լ������к��� 
	 * @param no
	 */
	public List<QQAccount> queryByNo(String no);

}
