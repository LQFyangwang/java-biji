package com.gs.frame;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class MyListModel implements ListModel<String> {

	private String[] data = {"list item 1", "list item 2", "list item 3"};
	
	@Override
	public int getSize() {
		return data.length;
	}

	@Override
	public String getElementAt(int index) {
		return data[index];
	}

	@Override
	public void addListDataListener(ListDataListener l) {
	
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		
	}

}
