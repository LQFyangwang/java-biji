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
		setTitle("���");
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
		String[] columnNames = new String[]{"��0", "��1", "��2"};
		// JTable���Ҫ��ʾ�����⣬������JTalbe���ڿɹ��������
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
		table.setModel(tableModel);
		// scrollPane.add(table); // ����ʹ��add���� �����
		scrollPane.setViewportView(table); // viewport�ĸ�����ָ�����ɹ������Ŀ��Ӳ���
		JButton btn = new JButton("���һ��");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ָ����λ�ò���һ��
				tableModel.insertRow(1, new String[]{"xx", "yy", "zz"});
				// ɾ��ָ������
				tableModel.removeRow(2);
				// ���һ����
				tableModel.addColumn("��3");
				// �ڱ���β�����һ��
				tableModel.addRow(new String[]{"aa", "bb", "cc"});
				// Vector��ʾ�б�Vector<>��Ӧ��һά����
				// Vector<Vector<>>��Ӧ�ڶ�ά����
				Vector<Vector<String>> vector = tableModel.getDataVector(); // ��ȡ������������
				System.out.println(vector.size());
				System.out.println(vector.get(0).get(2)); // ��ȡ��0�еĵ�2�е�����
				System.out.println(vector.get(1)); // ��ȡ��1 �е�����
				vector.get(0).set(1, "new data"); // ���õ�0�еĵ�һ�е�����
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
		// scrollPane.add(table); // ����ʹ��add���� �����
		scrollPane.setViewportView(table); // viewport�ĸ�����ָ�����ɹ������Ŀ��Ӳ���
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
