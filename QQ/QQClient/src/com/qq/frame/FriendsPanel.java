package com.qq.frame;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.listener.FriendsListMouseListener;
import com.qq.listener.FriendsListMouseMotionListener;
import com.qq.service.FriendsService;
import com.qq.service.FriendsServiceImpl;

public class FriendsPanel extends JPanel {

	private static final long serialVersionUID = -2387112362547767506L;
	
	private DefaultListModel<QQAccount> model;
	private QQClient qqClient;
	private QQAccount currentAccount;
	private FriendsService friendsService;
	
	public FriendsPanel(QQClient qqClient,  QQAccount currentAccount) {
		setOpaque(false);
		friendsService = new FriendsServiceImpl();
		this.qqClient = qqClient;
		this.currentAccount = currentAccount;
		initFriendList();
	}
	
	private void initFriendList() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		JList<QQAccount> friendList = new JList<QQAccount>();
		friendList.setFixedCellHeight(60); // 设置单元格的高度
		friendList.setFixedCellWidth(300); // 设置单元格的宽度
		friendList.setVisibleRowCount(7); // 可见的单元格个数
		friendList.setOpaque(false); // 好友列表设置透明
		model = new DefaultListModel<QQAccount>();
		List<QQAccount> friends = friendsService.queryByNo(currentAccount.getNo()); // 查找登录账户的所有好友并显示到好友列表
		for (QQAccount a : friends) {
			model.addElement(a);
		}
		friendList.setModel(model);
		friendList.setCellRenderer(new FriendListCellRenderer()); // 设置JList的渲染器，让JList看起来像什么样子
		scrollPane.setViewportView(friendList); // 把控件设置到滚动窗口的视口
		friendList.addMouseMotionListener(new FriendsListMouseMotionListener());
		friendList.addMouseListener(new FriendsListMouseListener(qqClient, currentAccount));
		add(scrollPane);
	}
	
	/**
	 * 用于把添加的好友信息显示到好友列表
	 * @param account
	 */
	public void updateFriendList(QQAccount account) {
		model.addElement(account);
	}
	
}
