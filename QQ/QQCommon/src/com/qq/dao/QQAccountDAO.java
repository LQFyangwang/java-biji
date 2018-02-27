package com.qq.dao;

import java.util.List;

import com.qq.bean.QQAccount;

public interface QQAccountDAO extends BaseDAO<QQAccount> {
	
	public QQAccount queryByNo(String no);
	
	public QQAccount queryByNoPwd(String no, String pwd);
	
	public boolean isAccountExist(String no);
	
	public List<QQAccount> queryByCriteria(QQAccount account); // 根据指定的条件（条件的组合）来查找相应的账号信息
	
	public void updateStatus(String no, String status); // 更新指定账号的状态

}
