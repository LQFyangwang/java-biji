package com.qq.dao;

import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.qq.bean.Friends;
import com.qq.bean.QQAccount;

public class FriendsDAOImpl extends AbstractBaseDAO implements FriendsDAO {

	@Override
	public Friends queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Friends t) {
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into t_friends(account1, account2, relation_time) values(?, ?, ?)");
			ps.setString(1, t.getAccount1());
			ps.setString(2, t.getAccount2());
			ps.setDate(3, new Date(Calendar.getInstance().getTime().getTime()));
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
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
		List<QQAccount> friends = new ArrayList<QQAccount>();
		getConn();
		try {
			PreparedStatement ps = conn.prepareStatement("select a.* from t_friends f, t_account a where account1 = ? and a.no = f.account2");
			ps.setString(1, no);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				QQAccount account = new QQAccount();
				account.setId(rs.getInt("id"));
				account.setNo(rs.getString("no"));
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
				friends.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return friends;
	}

}
