package com.gs.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame {
	
	private static final long serialVersionUID = 4238559403654849963L;

	public JTableTest() {
		setSize(400, 600);
		setTitle("表格");
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		initTable();
		// initTable1();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void initTable() {
		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable(5, 3);
		String[][] data = new String[][]{{"0-0", "0-1", "0-2"}, {"1-0", "1-1", "1-2"}, {"2-0", "2-1", "2-2"}};
		String[] columnNames = new String[]{"列0", "列1", "列2"};
		// JTable如果要显示出标题，则必须把JTalbe放在可滚动面板里
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
		table.setModel(tableModel);
		// scrollPane.add(table); // 不能使用add方法 来添加
		scrollPane.setViewportView(table); // viewport的概念是指整个可滚动面板的可视部分
		JButton btn = new JButton("添加一行");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 在指定行位置插入一行
				tableModel.insertRow(1, new String[]{"xx", "yy", "zz"});
				// 删除指定的行
				tableModel.removeRow(2);
				// 添加一个列
				tableModel.addColumn("列3");
				// 在表格的尾部添加一行
				tableModel.addRow(new String[]{"aa", "bb", "cc"});
				// Vector表示列表，Vector<>对应于一维数据
				// Vector<Vector<>>对应于二维数组
				Vector<Vector<String>> vector = tableModel.getDataVector(); // 获取整个表格的数据
				System.out.println(vector.size());
				System.out.println(vector.get(0).get(2)); // 获取第0行的第2列的数据
				System.out.println(vector.get(1)); // 获取第1 行的数据
				vector.get(0).set(1, "new data"); // 设置第0行的第一列的数据
			}
			
		});
		add(scrollPane, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
	
	private void initTable1() {
		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable();
		MyTableModel myTableModel = new MyTableModel();
		myTableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				System.out.println("aaa");
			}
			
		});
		table.setModel(myTableModel);
		// scrollPane.add(table); // 不能使用add方法 来添加
		scrollPane.setViewportView(table); // viewport的概念是指整个可滚动面板的可视部分
		add(scrollPane);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JTableTest();
			}
		});
	}

}
