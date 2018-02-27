package com.qq.service;

import java.io.Serializable;
import java.util.List;

import com.qq.bean.QQAccount;
import com.qq.common.DateUtil;
import com.qq.dao.QQAccountDAO;
import com.qq.dao.QQAccountDAOImpl;

public class QQAccountServiceImpl implements QQAccountService {

	private QQAccountDAO accountDAO;
	
	public QQAccountServiceImpl() {
		accountDAO = new QQAccountDAOImpl();
	}
	
	@Override
	public QQAccount queryById(Serializable id) {
		return accountDAO.queryById(id);
	}

	@Override
	public void add(QQAccount t) {
		if (t.getBirthday() != null) {
			t.setAge(DateUtil.getAge(t.getBirthday()));
		}
		accountDAO.add(t);
	}

	@Override
	public void update(QQAccount t) {
		accountDAO.update(t);
	}

	@Override
	public void delete(QQAccount t) {
		accountDAO.delete(t);
	}

	@Override
	public QQAccount queryByNoPwd(String no, String pwd) {
		return accountDAO.queryByNoPwd(no, pwd);
	}
	
	@Override
	public boolean isAccountExist(String no) {
		return accountDAO.isAccountExist(no);
	}
	
	@Override
	public List<QQAccount> queryByCriteria(QQAccount account) {
		return accountDAO.queryByCriteria(account);
	}

	@Override
	public QQAccount queryByNo(String no) {
		return accountDAO.queryByNo(no);
	}

	@Override
	public void updateStatus(String no, String status) {
		accountDAO.updateStatus(no, status);
	}

}
