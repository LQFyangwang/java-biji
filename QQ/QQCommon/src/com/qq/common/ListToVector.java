package com.qq.common;

import java.util.List;
import java.util.Vector;

import com.qq.bean.QQAccount;

public class ListToVector {
	
	/**
	 * ��QQAccount����ɵ�List����ת����JTable�ܹ�ʹ�õ�Vector<Vector<Object>>���ݶ���
	 * @param accounts
	 * @return
	 */
	public static Vector<Vector<Object>> list2Vector(List<QQAccount> accounts) {
		Vector<Vector<Object>> vectors = new Vector<Vector<Object>>(); // ������������е�����
		for (QQAccount a : accounts) {
			Vector<Object> row = new Vector<Object>(); // ÿһ�е�����
			row.add(a.getHeadIcon()); // ÿһ�еĵ�һ�е�����
			row.add(a.getNo()); // �ڶ�������
			row.add(a.getNickname()); // ÿһ�еĵ����е�����
			row.add(a.getGender()); // �����е�����
			row.add(a.getAge()); // �����е�����
 			vectors.add(row);
		}
		return vectors;
	}

}
