package com.qq.dao;

import java.util.List;

import com.qq.bean.QQAccount;

public interface QQAccountDAO extends BaseDAO<QQAccount> {
	
	public QQAccount queryByNo(String no);
	
	public QQAccount queryByNoPwd(String no, String pwd);
	
	public boolean isAccountExist(String no);
	
	public List<QQAccount> queryByCriteria(QQAccount account); // ����ָ������������������ϣ���������Ӧ���˺���Ϣ
	
	public void updateStatus(String no, String status); // ����ָ���˺ŵ�״̬

}
