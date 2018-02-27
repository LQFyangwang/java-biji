package com.gs.component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class ListAndEventTest extends Frame implements ItemListener {

	private static final long serialVersionUID = -744906282957105296L;
	
	private static final String[] ITEMS = {"item 1", "item 2", "item 3"};
	
	public ListAndEventTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initList();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ListAndEventTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	private void initList() {
		// Ĭ�ϲ�֧�ֶ�ѡ
		List list = new List(5, true); // ��һ��������ʾ��ʾ���������ڶ���������ʾ�Ƿ�֧�ֶ�ѡ
		for (int i = 0, len = ITEMS.length; i < len; i++) {
			list.add(ITEMS[i]);
		}
		list.addItemListener(this);
		add(list);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("item state changed...");
		Integer index = (Integer) e.getItem(); // ����item��List�б��е�����ֵ
		System.out.println(ITEMS[index]);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ListAndEventTest();
			}
			
		});
	}

}
