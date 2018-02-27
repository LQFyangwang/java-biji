package com.qq.common;

import java.awt.Font;
import java.util.Vector;

public class UIUtil {
	
	/**
	 * 获取指定大小的字体
	 * @param size
	 * @return
	 */
	public static Font myFont(int size) {
		return new Font("微软雅黑", Font.PLAIN, size);
	}
	
	/**
	 * 获取查找好友时的表格的列名称
	 * @return
	 */
	public static Vector<String> getSearchColumnNames() {
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("头像");
		columnNames.add("账号");
		columnNames.add("昵称");
		columnNames.add("性别");
		columnNames.add("年龄");
		return columnNames;
	}

}
