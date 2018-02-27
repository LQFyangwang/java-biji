package com.qq.dao;

import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.qq.bean.QQAccount;

public class QQAccountDAOImpl extends AbstractBaseDAO implements QQAccountDAO {

	@Override
	public QQAccount queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(QQAccount t) {
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into t_account(no, nickname, pwd, gender, birthday, province, city, phone) values(?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, t.getNo());
			ps.setString(2, t.getNickname());
			ps.setString(3, t.getPwd());
			ps.setString(4, "");
			// ps.setDate(5, new Date(t.getBirthday().getTime())); // java.util.Date  ->  java.sql.Date
			ps.setDate(5, new Date(Calendar.getInstance().getTime().getTime()));
			ps.setString(6, "");
			ps.setString(7, "");
			ps.setString(8, "");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}

	@Override
	public void update(QQAccount t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(QQAccount t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public QQAccount queryByNoPwd(String no, String pwd) {
		QQAccount account = null;
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from t_account where no = ? and pwd = ?");
			ps.setString(1, no);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account = new QQAccount();
				account.setId(rs.getInt("id"));
				account.setNo(no);
				account.setPwd(pwd);
				account.setNickname(rs.getString("nickname"));
				account.setHeadIcon(rs.getString("headicon"));
				account.setSign(rs.getString("sign"));
				account.setPhone(rs.getString("phone"));
				account.setGender(rs.getString("gender"));
				account.setBirthday(rs.getDate("birthday"));
				account.setAge(rs.getInt("age"));
				account.setEmail(rs.getString("email"));
				account.setProvince(rs.getString("province"));
				account.setCity(rs.getString("city"));
				account.setArea(rs.getString("area"));
				account.setDes(rs.getString("des"));
				account.setCompany(rs.getString("company"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return account;
	}

	@Override
	public boolean isAccountExist(String no) {
		getConn();
		boolean exist = false; // 默认不存在
		try {
			PreparedStatement ps = conn.prepareStatement("select count(id) from t_account where no = ?");
			ps.setString(1, no);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				if (count == 1) {
					exist = true; // 如果通过此no查找到的等于1，意味着此账号的人已经存在
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close();
		return exist;
	}

	@Override
	public List<QQAccount> queryByCriteria(QQAccount account) {
		getConn();
		List<QQAccount> accounts = new ArrayList<QQAccount>();
		String sql = "select * from t_account where 1 = 1 and status != 'offline'";
		if (account.getNo() != null && !account.getNo().equals("")) { // 如果no不为空，则意味着想要用no来搜索
			sql += " and no = '" + account.getNo() + "'"; 
		} else if (account.getNickname() != null && !account.getNickname().equals("")) { // 想要用昵称搜索
			sql += " and nickname like '%" + account.getNickname() + "%'";
		} else if (account.getGender() != null && !account.getGender().equals("")) { // 想要根据性别来搜索
			sql += " and gender = '" + account.getGender() + "'";
		}
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				QQAccount a = new QQAccount();
				a.setHeadIcon(rs.getString("headicon"));
				a.setNo(rs.getString("no"));
				a.setNickname(rs.getString("nickname"));
				a.setGender(rs.getString("gender"));
				a.setAge(rs.getInt("age"));
				accounts.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close();
		return accounts;
	}

	@Override
	public QQAccount queryByNo(String no) {
		QQAccount account = null;
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from t_account where no = ?");
			ps.setString(1, no);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account = new QQAccount();
				account.setId(rs.getInt("id"));
				account.setNo(no);
				account.setNickname(rs.getString("nickname"));
				account.setHeadIcon(rs.getString("headicon"));
				account.setSign(rs.getString("sign"));
				account.setPhone(rs.getString("phone"));
				account.setGender(rs.getString("gender"));
				account.setBirthday(rs.getDate("birthday"));
				account.setAge(rs.getInt("age"));
				account.setEmail(rs.getString("email"));
				account.setProvince(rs.getString("province"));
				account.setCity(rs.getString("city"));
				account.setArea(rs.getString("area"));
				account.setDes(rs.getString("des"));
				account.setCompany(rs.getString("company"));
				account.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return account;
	}

	@Override
	public void updateStatus(String no, String status) {
		getConn();
		String sql = "update t_account set status = ? where no = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, status);
			ps.setString(2, no);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
	}

}
