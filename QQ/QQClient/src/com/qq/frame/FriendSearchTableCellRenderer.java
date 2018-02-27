package com.qq.frame;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class FriendSearchTableCellRenderer implements TableCellRenderer {

	/**
	 * ����JTable��ÿһ����Ԫ�񳤵���ʲô����
	 * �������������Ŀ��˵��ͬһ�еĵ�Ԫ����һ����
	 * Object value��ÿһ����Ԫ�������
	 */
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		if (column == 0) {
			ImageIcon head = null;
			if (value == null || value.toString().equals("")) {
				head = new ImageIcon("src/images/head/head.png");
			} else {
				head = new ImageIcon("src/images/head/" + value.toString());
			}
			JLabel headLbl = new JLabel(head);
			return headLbl;
		} else if (column == 1 || column == 2 || column == 3) {
			JLabel lbl = new JLabel(value.toString());
			return lbl;
		} else if (column == 4) {
			JLabel ageLbl = new JLabel(String.valueOf(value));
			return ageLbl;
		}
		return null;
	}

}
