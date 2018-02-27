package com.qq.frame;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class FriendSearchTableCellRenderer implements TableCellRenderer {

	/**
	 * 告诉JTable，每一个单元格长得像什么样子
	 * 对于我们这个项目来说，同一列的单元格都是一样的
	 * Object value是每一个单元格的数据
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
