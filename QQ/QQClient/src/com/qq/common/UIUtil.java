package com.qq.common;

import java.awt.Font;
import java.util.Vector;

public class UIUtil {
	
	/**
	 * ��ȡָ����С������
	 * @param size
	 * @return
	 */
	public static Font myFont(int size) {
		return new Font("΢���ź�", Font.PLAIN, size);
	}
	
	/**
	 * ��ȡ���Һ���ʱ�ı���������
	 * @return
	 */
	public static Vector<String> getSearchColumnNames() {
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("ͷ��");
		columnNames.add("�˺�");
		columnNames.add("�ǳ�");
		columnNames.add("�Ա�");
		columnNames.add("����");
		return columnNames;
	}

}
