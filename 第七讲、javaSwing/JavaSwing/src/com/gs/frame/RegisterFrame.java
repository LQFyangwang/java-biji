package com.gs.frame;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RegisterFrame extends JFrame {

	private static final long serialVersionUID = -7980496791932038245L;
	
	public RegisterFrame() {
		setSize(400, 700);
		setTitle("注册");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null); // 内容面板
		initWidgets();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private void initWidgets() {
		JLabel accLbl = new JLabel("昵称");
		accLbl.setBounds(new Rectangle(100, 50, 50, 20));
		add(accLbl);
		JTextField accTxt = new JTextField(20);
		accTxt.setBounds(new Rectangle(160, 50, 100, 20));
		add(accTxt);
		JLabel pwdLbl = new JLabel("密码");
		pwdLbl.setBounds(new Rectangle(100, 80, 50, 20));
		add(pwdLbl);
		JPasswordField pwdTxt = new JPasswordField(20);
		pwdTxt.setBounds(new Rectangle(160, 80, 100, 20));
		add(pwdTxt);
		JRadioButton maleBtn = new JRadioButton("男"); // ActionListener
		maleBtn.setBounds(new Rectangle(100, 110, 50, 20));
		JRadioButton femaleBtn = new JRadioButton("女");
		femaleBtn.setBounds(new Rectangle(150, 110, 50, 20));
		ButtonGroup group = new ButtonGroup(); // 需要用按钮组把多个单选按钮关联在一起，才能支持选择一个
		group.add(maleBtn);
		group.add(femaleBtn);
		add(maleBtn);
		add(femaleBtn);
		JCheckBox hobby1CB = new JCheckBox("运动");
		hobby1CB.setBounds(new Rectangle(100, 140, 100, 20));
		add(hobby1CB);
		JCheckBox hobby2CB = new JCheckBox("阅读"); // ItemListener
		hobby2CB.setBounds(new Rectangle(200, 140, 100, 20));
		add(hobby2CB);
		JComboBox<String> cb1 = new JComboBox<String>(); // ItemListener
		cb1.addItem("博士");
		cb1.addItem("硕士");
		cb1.setBounds(new Rectangle(100, 170, 100, 20));
		add(cb1);
		JList<String> list = new JList<String>();
		DefaultListModel<String> listModel = new DefaultListModel<String>(); // 给JList提供数据模型 
		listModel.addElement("篮球");
		listModel.addElement("足球");
		listModel.addElement("跑步");
		listModel.addElement("阅读");
		list.setModel(listModel);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ); // 设置选择模式
		list.setBounds(new Rectangle(100, 210, 100, 80));
		list.addListSelectionListener(new ListSelectionListener() { // 列表选择事件
			
			@SuppressWarnings("unchecked")
			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> list = (JList<String>) e.getSource();
				System.out.println(list.getSelectedIndex()); // 获取被选中项的索引
				System.out.println(list.getSelectedValue()); // 获取被选中项的值
			}
		});
		add(list);
		JList<String> list1 = new JList<String>(new String[]{"item 1", "item 2", "item 3"});
		list1.setBounds(new Rectangle(100, 300, 100, 80));
		add(list1);
		JButton uploadBtn = new JButton("上传头像");
		uploadBtn.setBounds(new Rectangle(100, 390, 100, 30));
		add(uploadBtn);
		uploadBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); // 实例化文件选择框 
				int result = fileChooser.showOpenDialog(RegisterFrame.this); // 显示打开文件窗口
				if (result == JFileChooser.APPROVE_OPTION) { // 点击了打开按钮
					System.out.println("approve");
					File file = fileChooser.getSelectedFile(); // 获取被选择的文件
					System.out.println(file.getName()); // getName获取文件的名称
				} else if (result == JFileChooser.CANCEL_OPTION) { // 点击了取消按钮
					System.out.println("cancle");
				} 
			}
			
		});
		JButton saveBtn = new JButton("保存文件");
		saveBtn.setBounds(new Rectangle(100, 430, 100, 30));
		add(saveBtn);
		saveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); // 实例化文件选择框 
				int result = fileChooser.showSaveDialog(RegisterFrame.this); // 显示保存文件窗口
				if (result == JFileChooser.APPROVE_OPTION) { // 点击了保存按钮 
					System.out.println("approve");
					File file = fileChooser.getSelectedFile(); // 获取即将要保存的文件
					System.out.println(file.getName()); // getName获取文件的名称
				} else if (result == JFileChooser.CANCEL_OPTION) { // 点击了取消按钮
					System.out.println("cancle");
				}
			}
			
		});
		JButton regBtn = new JButton("登录");
		regBtn.setBounds(new Rectangle(100, 620, 200, 40));
		regBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		add(regBtn);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new RegisterFrame();
			}
			
		});
	}

}
