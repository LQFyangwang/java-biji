package com.qq.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import com.qq.bean.Message;
import com.qq.bean.MessageType;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.common.FileUtil;
import com.qq.frame.ChatFrame;
import com.qq.frame.ExpressionWindow;

public class ChatFrameMouseListener extends MouseAdapter {

	private QQClient qqClient;
	private QQAccount fromAccount;
	private QQAccount toAccount;
	private JTextPane chatPane;
	
	private ChatFrame chatFrame;
	
	public ChatFrameMouseListener(QQClient qqClient, QQAccount fromAccount, QQAccount toAccount) {
		this.qqClient = qqClient;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	
	public ChatFrame getChatFrame() {
		return chatFrame;
	}

	public void setChatFrame(ChatFrame chatFrame) {
		this.chatFrame = chatFrame;
	}

	public JTextPane getChatPane() {
		return chatPane;
	}

	public void setChatPane(JTextPane chatPane) {
		this.chatPane = chatPane;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj instanceof JLabel) {
			JLabel lbl = (JLabel) obj;
			String name = lbl.getName();
			if (name.equals("sendMsg")) { // ���������Ƿ��Ͱ�ť�����ȡ���촰���ڵ��ı����ݣ���װ��Message���󣬷����ߣ������ߣ�����ʱ�䣬���ݣ���Ϣ����
				Message message = new Message();
				message.setFrom(fromAccount);
				message.setTo(toAccount);
				message.setSendTime(Calendar.getInstance().getTime());
				String text = chatPane.getText(); // ��ȡ����������ı��������ͼ�꣬��ͼ��λ����һ���ո�
				chatPane.setText(""); // ������ͺ���Ҫ��������ı�ȫ����յ�������Сͼ��
				Map<Integer, String> icons = new HashMap<Integer, String>();  // ���´���һ��map�����洢�ĸ�λ����Ҫ���ĸ�ͼ��
				icons.putAll(chatFrame.getIcons()); // �ѱ�����ChatFrame�е�λ����ͼ���ӳ���ϵcopy����һ�д�������Map��
				message.setIcons(icons); // �´�����ͼ��map���뵽Message����
				message.setMessage(text);
				message.setMessageType(MessageType.TEXT_MESSAGE);
				chatFrame.updateChatMe(text); // ���·������Լ�����Ϣ��
				qqClient.sendMessage(message); // ����Ϣ���͵������	
			} else if (name.equals("sendFile")) {
				JFileChooser fileChooser = new JFileChooser();
				int result = fileChooser.showOpenDialog(chatFrame);
				if (result == JFileChooser.APPROVE_OPTION) {
					// ȷ��ѡ����ļ�����ʼ�����ļ�
					File file = fileChooser.getSelectedFile();
					Message message = new Message();
					message.setFrom(fromAccount);
					message.setTo(toAccount);
					message.setSendTime(Calendar.getInstance().getTime());
					message.setMessage(file.getName());
					message.setData(FileUtil.readFile(file));
					message.setMessageType(MessageType.FILE_MESSAGE);
					qqClient.sendMessage(message);
				}
			} else if (name.equals("exp")) {
				// չ���������ʾ���б���
				ExpressionWindow expWin = new ExpressionWindow(chatFrame, chatPane, e.getXOnScreen(), e.getYOnScreen());
				ChatFrameMouseMotionListener chatLtn = new ChatFrameMouseMotionListener(expWin);
				chatFrame.addMouseListener(chatLtn);
				chatFrame.addMouseMotionListener(chatLtn);
			}
		}
	}

}
