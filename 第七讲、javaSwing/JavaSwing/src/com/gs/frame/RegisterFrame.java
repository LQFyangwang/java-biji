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
		setTitle("ע��");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null); // �������
		initWidgets();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private void initWidgets() {
		JLabel accLbl = new JLabel("�ǳ�");
		accLbl.setBounds(new Rectangle(100, 50, 50, 20));
		add(accLbl);
		JTextField accTxt = new JTextField(20);
		accTxt.setBounds(new Rectangle(160, 50, 100, 20));
		add(accTxt);
		JLabel pwdLbl = new JLabel("����");
		pwdLbl.setBounds(new Rectangle(100, 80, 50, 20));
		add(pwdLbl);
		JPasswordField pwdTxt = new JPasswordField(20);
		pwdTxt.setBounds(new Rectangle(160, 80, 100, 20));
		add(pwdTxt);
		JRadioButton maleBtn = new JRadioButton("��"); // ActionListener
		maleBtn.setBounds(new Rectangle(100, 110, 50, 20));
		JRadioButton femaleBtn = new JRadioButton("Ů");
		femaleBtn.setBounds(new Rectangle(150, 110, 50, 20));
		ButtonGroup group = new ButtonGroup(); // ��Ҫ�ð�ť��Ѷ����ѡ��ť������һ�𣬲���֧��ѡ��һ��
		group.add(maleBtn);
		group.add(femaleBtn);
		add(maleBtn);
		add(femaleBtn);
		JCheckBox hobby1CB = new JCheckBox("�˶�");
		hobby1CB.setBounds(new Rectangle(100, 140, 100, 20));
		add(hobby1CB);
		JCheckBox hobby2CB = new JCheckBox("�Ķ�"); // ItemListener
		hobby2CB.setBounds(new Rectangle(200, 140, 100, 20));
		add(hobby2CB);
		JComboBox<String> cb1 = new JComboBox<String>(); // ItemListener
		cb1.addItem("��ʿ");
		cb1.addItem("˶ʿ");
		cb1.setBounds(new Rectangle(100, 170, 100, 20));
		add(cb1);
		JList<String> list = new JList<String>();
		DefaultListModel<String> listModel = new DefaultListModel<String>(); // ��JList�ṩ����ģ�� 
		listModel.addElement("����");
		listModel.addElement("����");
		listModel.addElement("�ܲ�");
		listModel.addElement("�Ķ�");
		list.setModel(listModel);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ); // ����ѡ��ģʽ
		list.setBounds(new Rectangle(100, 210, 100, 80));
		list.addListSelectionListener(new ListSelectionListener() { // �б�ѡ���¼�
			
			@SuppressWarnings("unchecked")
			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> list = (JList<String>) e.getSource();
				System.out.println(list.getSelectedIndex()); // ��ȡ��ѡ���������
				System.out.println(list.getSelectedValue()); // ��ȡ��ѡ�����ֵ
			}
		});
		add(list);
		JList<String> list1 = new JList<String>(new String[]{"item 1", "item 2", "item 3"});
		list1.setBounds(new Rectangle(100, 300, 100, 80));
		add(list1);
		JButton uploadBtn = new JButton("�ϴ�ͷ��");
		uploadBtn.setBounds(new Rectangle(100, 390, 100, 30));
		add(uploadBtn);
		uploadBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); // ʵ�����ļ�ѡ��� 
				int result = fileChooser.showOpenDialog(RegisterFrame.this); // ��ʾ���ļ�����
				if (result == JFileChooser.APPROVE_OPTION) { // ����˴򿪰�ť
					System.out.println("approve");
					File file = fileChooser.getSelectedFile(); // ��ȡ��ѡ����ļ�
					System.out.println(file.getName()); // getName��ȡ�ļ�������
				} else if (result == JFileChooser.CANCEL_OPTION) { // �����ȡ����ť
					System.out.println("cancle");
				} 
			}
			
		});
		JButton saveBtn = new JButton("�����ļ�");
		saveBtn.setBounds(new Rectangle(100, 430, 100, 30));
		add(saveBtn);
		saveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); // ʵ�����ļ�ѡ��� 
				int result = fileChooser.showSaveDialog(RegisterFrame.this); // ��ʾ�����ļ�����
				if (result == JFileChooser.APPROVE_OPTION) { // ����˱��水ť 
					System.out.println("approve");
					File file = fileChooser.getSelectedFile(); // ��ȡ����Ҫ������ļ�
					System.out.println(file.getName()); // getName��ȡ�ļ�������
				} else if (result == JFileChooser.CANCEL_OPTION) { // �����ȡ����ť
					System.out.println("cancle");
				}
			}
			
		});
		JButton regBtn = new JButton("��¼");
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
