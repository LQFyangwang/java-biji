package com.qq.frame;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import com.qq.bean.Message;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.common.ExpressionUtil;
import com.qq.listener.ChatFrameMouseListener;

	public class ChatFrame extends JFrame {

	private static final long serialVersionUID = 2642885373345001299L;
	private QQAccount toAccount;
	private ChatFrameMouseListener chatLtn;
	private JTextPane msgPane; 
	private JTextPane chatPane; // 用于输入聊天信息和插入聊天表情
	
	private Map<Integer, String> icons = new HashMap<Integer, String>();
	
	public ChatFrame(QQClient qqClient, QQAccount fromAccount, QQAccount toAccount) {
		this.toAccount = toAccount;
		qqClient.setChatFrame(this);
		setSize(700, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		chatLtn = new ChatFrameMouseListener(qqClient, fromAccount, toAccount);
		initTop();
		initMsgShow();
		initExtra();
		initMsgInput();
		initOperation();
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * 好友信息
	 */
	private void initTop() {
		// 显示对方的基本信息
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 700, 60);
		ImageIcon headIcon = null;
		if (toAccount.getHeadIcon() == null || toAccount.getHeadIcon().equals("")) {
			headIcon = new ImageIcon("src/images/head/head.png");
		} else {
			headIcon = new ImageIcon("src/images/" + toAccount.getHeadIcon());
		}
		JLabel headLbl = new JLabel(headIcon);
		headLbl.setBounds(10, 0, 60, 60);
		panel.add(headLbl);
		add(panel);
	}
	
	/**
	 * 显示聊天信息
	 */
	private void initMsgShow() {
		JScrollPane scrollPane = new JScrollPane();
		msgPane = new JTextPane();
		scrollPane.setBounds(0, 100, 700, 200);
		msgPane.setEditable(false); // 显示消息的文本框不支持编辑功能
		scrollPane.setViewportView(msgPane);
		add(scrollPane);
	}
	
	/**
	 * 显示修改字体，发送文件，发送表情，抖一抖，截图，视频聊天，语音聊天
	 */
	private void initExtra() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 305, 700, 30);
		JComboBox<String> fontBox = new JComboBox<String>();
		fontBox.addItem("黑体");
		fontBox.setBounds(0, 0, 30, 30);
		panel.add(fontBox);
		JLabel fileLbl  = new JLabel(new ImageIcon("src/images/online.png"));
		fileLbl.setBounds(40, 0, 30, 30);
		fileLbl.setName("sendFile");
		fileLbl.addMouseListener(chatLtn);
		panel.add(fileLbl);
		JLabel expLbl = new JLabel(new ImageIcon("src/images/expression/1.gif"));
		expLbl.setBounds(80, 0, 30, 30);
		expLbl.setName("exp");
		expLbl.addMouseListener(chatLtn);
		panel.add(expLbl);
		add(panel);
	}
	
	/**
	 * 输入聊天信息的部分
	 */
	private void initMsgInput() {
		JScrollPane scrollPane = new JScrollPane();
		chatPane = new JTextPane();
		scrollPane.setBounds(0, 340, 700, 200);
		scrollPane.setViewportView(chatPane);
		add(scrollPane);
	}
	
	/**
	 * 关闭和发送
	 */
	private void initOperation() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 550, 700, 50);
		JLabel sendLbl = new JLabel("发送");
		sendLbl.setName("sendMsg");
		
		chatLtn.setChatFrame(this);
		chatLtn.setChatPane(chatPane);
		sendLbl.addMouseListener(chatLtn);
		sendLbl.setBounds(540, 550, 60, 50);
		panel.add(sendLbl);
		add(panel);
	}
	
	/**
	 * 更新聊天窗口的内容
	 * @param message
	 */
	public void updateChat(Message msg) {
		Map<Integer, String> icons = msg.getIcons(); // 获取需要插入图标的位置
		String text = msg.getMessage(); // 获取到所有 的消息包括字符串和图标所对应的空格
		Document doc = msgPane.getDocument(); // msgPane的Document对象
		try {
			doc.insertString(doc.getLength(), msg.getFrom().getNickname() + "说：\n", null); // 在消息框的末尾添加   哪个人说：
			Set<Integer> keySet = icons.keySet();
			int begin = 0;
			for (int location : keySet) {
				doc.insertString(doc.getLength(), text.substring(begin, location), null);
				msgPane.setCaretPosition(doc.getLength());
				msgPane.insertIcon(ExpressionUtil.getIcon(icons.get(location)));
				begin = location + 1;
			}
			doc.insertString(doc.getLength(), text.substring(begin) + "\n", null);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 直接把输入框中的所有文本传递过来进行更新
	 * 更新消息框
	 * @param text
	 */
	public void updateChatMe(String text) {
		Document doc = msgPane.getDocument(); // 获取msgPane所对应的Document对象，此Document对象包含有String和ImageIcon
		try {
			doc.insertString(doc.getLength(), "我说：\n", null); // 在整个msgPane的末尾添加字符串   我说：
			Set<Integer> keySet = icons.keySet(); // 获取需要在哪个位置上插入图标
			int begin = 0;
			for (int location : keySet) { // 对需要插入图标的位置进行循环操作
				// location是需要在哪个位置上插入图标
				doc.insertString(doc.getLength(), text.substring(begin, location), null); // 先插入在此图标之前的字符串
				msgPane.setCaretPosition(doc.getLength()); // 插入图标
				msgPane.insertIcon(ExpressionUtil.getIcon(icons.get(location)));
				begin = location + 1;
			}
			doc.insertString(doc.getLength(), text.substring(begin) + "\n", null);
			icons.clear(); // 把图标信息输出了后，直接把位置设置成空对象
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	public Map<Integer, String> getIcons() {
		return icons;
	}

	public void setIcons(Map<Integer, String> icons) {
		this.icons = icons;
	}


}
