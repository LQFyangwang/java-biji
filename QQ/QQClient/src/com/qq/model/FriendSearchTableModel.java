package com.qq.model;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class FriendSearchTableModel extends DefaultTableModel {

	private static final long serialVersionUID = 7289195289619347821L;
	
	public FriendSearchTableModel(Vector<Vector<Object>> data, Vector<String> columns) {
		super(data, columns);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

}
