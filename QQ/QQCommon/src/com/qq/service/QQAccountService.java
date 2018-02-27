package com.qq.service;

import java.util.List;

import com.qq.bean.QQAccount;

public interface QQAccountService extends BaseService<QQAccount> {
	
	public QQAccount queryByNo(String no);
	
	public QQAccount queryByNoPwd(String no, String pwd);
	
	public boolean isAccountExist(String no);
	
	public List<QQAccount> queryByCriteria(QQAccount account);
	
	public void updateStatus(String no, String status);

}
