package com.qq.common;

import java.util.List;
import java.util.Vector;

import com.qq.bean.QQAccount;

public class ListToVector {
	
	/**
	 * 把QQAccount所组成的List集合转化成JTable能够使用的Vector<Vector<Object>>数据对象
	 * @param accounts
	 * @return
	 */
	public static Vector<Vector<Object>> list2Vector(List<QQAccount> accounts) {
		Vector<Vector<Object>> vectors = new Vector<Vector<Object>>(); // 里面包含所有行的数据
		for (QQAccount a : accounts) {
			Vector<Object> row = new Vector<Object>(); // 每一行的数据
			row.add(a.getHeadIcon()); // 每一行的第一列的数据
			row.add(a.getNo()); // 第二的数据
			row.add(a.getNickname()); // 每一行的第三列的数据
			row.add(a.getGender()); // 第四列的数据
			row.add(a.getAge()); // 第五列的数据
 			vectors.add(row);
		}
		return vectors;
	}

}
