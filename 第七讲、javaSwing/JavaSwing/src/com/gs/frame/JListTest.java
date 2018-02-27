package com.gs.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class JListTest extends JFrame {
	
	private static final long serialVersionUID = 4238559403654849963L;

	public JListTest() {
		setSize(400, 600);
		setTitle("表格");
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		initList1();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void initList() {
		JScrollPane scrollPane = new JScrollPane();
		MyListModel listModel = new MyListModel();
		JList<String> list = new JList<String>(listModel);
		scrollPane.setViewportView(list); // viewport的概念是指整个可滚动面板的可视部分
		add(scrollPane, BorderLayout.CENTER);
	}
	
	private void initList1() {
		JScrollPane scrollPane = new JScrollPane();
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("item 1");
		JList<String> list = new JList<String>(listModel);
		scrollPane.setViewportView(list); // viewport的概念是指整个可滚动面板的可视部分
		add(scrollPane, BorderLayout.CENTER);
		JButton btn= new JButton("添加数据");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listModel.addElement("item 2");
				listModel.setElementAt("new item 1", 0);
				listModel.remove(0);
				listModel.removeElementAt(0);
			}
			
		});
		add(btn, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JListTest();
			}
		});
	}

}
