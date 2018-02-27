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
	private JTextPane chatPane; // ��������������Ϣ�Ͳ����������
	
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
	 * ������Ϣ
	 */
	private void initTop() {
		// ��ʾ�Է��Ļ�����Ϣ
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
	 * ��ʾ������Ϣ
	 */
	private void initMsgShow() {
		JScrollPane scrollPane = new JScrollPane();
		msgPane = new JTextPane();
		scrollPane.setBounds(0, 100, 700, 200);
		msgPane.setEditable(false); // ��ʾ��Ϣ���ı���֧�ֱ༭����
		scrollPane.setViewportView(msgPane);
		add(scrollPane);
	}
	
	/**
	 * ��ʾ�޸����壬�����ļ������ͱ��飬��һ������ͼ����Ƶ���죬��������
	 */
	private void initExtra() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 305, 700, 30);
		JComboBox<String> fontBox = new JComboBox<String>();
		fontBox.addItem("����");
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
	 * ����������Ϣ�Ĳ���
	 */
	private void initMsgInput() {
		JScrollPane scrollPane = new JScrollPane();
		chatPane = new JTextPane();
		scrollPane.setBounds(0, 340, 700, 200);
		scrollPane.setViewportView(chatPane);
		add(scrollPane);
	}
	
	/**
	 * �رպͷ���
	 */
	private void initOperation() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 550, 700, 50);
		JLabel sendLbl = new JLabel("����");
		sendLbl.setName("sendMsg");
		
		chatLtn.setChatFrame(this);
		chatLtn.setChatPane(chatPane);
		sendLbl.addMouseListener(chatLtn);
		sendLbl.setBounds(540, 550, 60, 50);
		panel.add(sendLbl);
		add(panel);
	}
	
	/**
	 * �������촰�ڵ�����
	 * @param message
	 */
	public void updateChat(Message msg) {
		Map<Integer, String> icons = msg.getIcons(); // ��ȡ��Ҫ����ͼ���λ��
		String text = msg.getMessage(); // ��ȡ������ ����Ϣ�����ַ�����ͼ������Ӧ�Ŀո�
		Document doc = msgPane.getDocument(); // msgPane��Document����
		try {
			doc.insertString(doc.getLength(), msg.getFrom().getNickname() + "˵��\n", null); // ����Ϣ���ĩβ���   �ĸ���˵��
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
	 * ֱ�Ӱ�������е������ı����ݹ������и���
	 * ������Ϣ��
	 * @param text
	 */
	public void updateChatMe(String text) {
		Document doc = msgPane.getDocument(); // ��ȡmsgPane����Ӧ��Document���󣬴�Document���������String��ImageIcon
		try {
			doc.insertString(doc.getLength(), "��˵��\n", null); // ������msgPane��ĩβ����ַ���   ��˵��
			Set<Integer> keySet = icons.keySet(); // ��ȡ��Ҫ���ĸ�λ���ϲ���ͼ��
			int begin = 0;
			for (int location : keySet) { // ����Ҫ����ͼ���λ�ý���ѭ������
				// location����Ҫ���ĸ�λ���ϲ���ͼ��
				doc.insertString(doc.getLength(), text.substring(begin, location), null); // �Ȳ����ڴ�ͼ��֮ǰ���ַ���
				msgPane.setCaretPosition(doc.getLength()); // ����ͼ��
				msgPane.insertIcon(ExpressionUtil.getIcon(icons.get(location)));
				begin = location + 1;
			}
			doc.insertString(doc.getLength(), text.substring(begin) + "\n", null);
			icons.clear(); // ��ͼ����Ϣ����˺�ֱ�Ӱ�λ�����óɿն���
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
