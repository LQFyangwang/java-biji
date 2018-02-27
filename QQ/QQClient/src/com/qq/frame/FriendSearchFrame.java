package com.qq.frame;

import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.common.UIUtil;
import com.qq.listener.FriendSearchFrameLblListener;
import com.qq.listener.FriendSearchFrameMouseListener;
import com.qq.model.FriendSearchTableModel;

public class FriendSearchFrame extends JFrame {

	private static final long serialVersionUID = -4134048915942250932L;
	
	private QQClient qqClient;
	private QQAccount account;

	public FriendSearchFrame(QQClient qqClient, QQAccount account) {
		this.account = account;
		this.qqClient = qqClient;
		setSize(800, 600);
		setTitle("∫√”—À—À˜");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		initTop();
		initBottom();
		
		setIconImage(new ImageIcon("src/images/qq_icon.png").getImage());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	private void initTop() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 200);
		panel.setLayout(null);
		JLabel accountLbl = new JLabel("’À∫≈");
		accountLbl.setBounds(20, 20, 60, 30);
		panel.add(accountLbl);
		JTextField accountTxt = new JTextField(40);
		accountTxt.setBounds(100, 20, 100, 30);
		panel.add(accountTxt);
		JLabel nicknameLbl = new JLabel("Í«≥∆");
		nicknameLbl.setBounds(20, 70, 60, 30);
		panel.add(nicknameLbl);
		JTextField nicknameTxt = new JTextField(40);
		nicknameTxt.setBounds(100, 70, 100, 30);
		panel.add(nicknameTxt);
		JLabel searchLbl = new JLabel(new ImageIcon("src/images/search_def.png"));
		searchLbl.setBounds(200, 70, 60, 30);
		searchLbl.setName("doSearch");
		FriendSearchFrameLblListener searchLblLtn = new FriendSearchFrameLblListener();
		searchLblLtn.setSearchFrame(this);
		searchLblLtn.setAccountTxt(accountTxt);
		searchLblLtn.setNicknameTxt(nicknameTxt);
		searchLbl.addMouseListener(searchLblLtn);
		panel.add(searchLbl);
		add(panel);
	}
	
	private FriendSearchTableModel tableModel;
	
	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	private void initBottom() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 200, 800, 400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 800, 400);
		JTable table = new JTable();
		table.setRowHeight(80);
		
		table.setDefaultRenderer(Object.class, new FriendSearchTableCellRenderer());  
		
		Vector<Vector<Object>> vectors = new Vector<Vector<Object>>();
		tableModel = new FriendSearchTableModel(vectors, UIUtil.getSearchColumnNames());
		table.setModel(tableModel);
		FriendSearchFrameMouseListener searchMouseLtn = new FriendSearchFrameMouseListener(qqClient, account);
		searchMouseLtn.setTable(table);
		table.addMouseListener(searchMouseLtn);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
		add(panel);
	}

}
