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
			if (name.equals("sendMsg")) { // 如果点击的是发送按钮，则获取聊天窗口内的文本内容，组装成Message对象，发送者，接收者，发送时间，内容，消息类型
				Message message = new Message();
				message.setFrom(fromAccount);
				message.setTo(toAccount);
				message.setSendTime(Calendar.getInstance().getTime());
				String text = chatPane.getText(); // 获取输入的所有文本，如果是图标，则图标位置是一个空格
				chatPane.setText(""); // 点击发送后，需要把输入的文本全部清空掉，包括小图标
				Map<Integer, String> icons = new HashMap<Integer, String>();  // 重新创建一个map用来存储哪个位置需要放哪个图标
				icons.putAll(chatFrame.getIcons()); // 把保存在ChatFrame中的位置与图标的映射关系copy到上一行创建的新Map中
				message.setIcons(icons); // 新创建的图标map放入到Message里面
				message.setMessage(text);
				message.setMessageType(MessageType.TEXT_MESSAGE);
				chatFrame.updateChatMe(text); // 更新发送者自己的消息框
				qqClient.sendMessage(message); // 把消息发送到服务端	
			} else if (name.equals("sendFile")) {
				JFileChooser fileChooser = new JFileChooser();
				int result = fileChooser.showOpenDialog(chatFrame);
				if (result == JFileChooser.APPROVE_OPTION) {
					// 确认选择的文件，开始发送文件
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
				// 展开面板来显示所有表情
				ExpressionWindow expWin = new ExpressionWindow(chatFrame, chatPane, e.getXOnScreen(), e.getYOnScreen());
				ChatFrameMouseMotionListener chatLtn = new ChatFrameMouseMotionListener(expWin);
				chatFrame.addMouseListener(chatLtn);
				chatFrame.addMouseMotionListener(chatLtn);
			}
		}
	}

}
