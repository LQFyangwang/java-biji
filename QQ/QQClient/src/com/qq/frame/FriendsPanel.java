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
		friendList.setFixedCellHeight(60); // ���õ�Ԫ��ĸ߶�
		friendList.setFixedCellWidth(300); // ���õ�Ԫ��Ŀ��
		friendList.setVisibleRowCount(7); // �ɼ��ĵ�Ԫ�����
		friendList.setOpaque(false); // �����б�����͸��
		model = new DefaultListModel<QQAccount>();
		List<QQAccount> friends = friendsService.queryByNo(currentAccount.getNo()); // ���ҵ�¼�˻������к��Ѳ���ʾ�������б�
		for (QQAccount a : friends) {
			model.addElement(a);
		}
		friendList.setModel(model);
		friendList.setCellRenderer(new FriendListCellRenderer()); // ����JList����Ⱦ������JList��������ʲô����
		scrollPane.setViewportView(friendList); // �ѿؼ����õ��������ڵ��ӿ�
		friendList.addMouseMotionListener(new FriendsListMouseMotionListener());
		friendList.addMouseListener(new FriendsListMouseListener(qqClient, currentAccount));
		add(scrollPane);
	}
	
	/**
	 * ���ڰ���ӵĺ�����Ϣ��ʾ�������б�
	 * @param account
	 */
	public void updateFriendList(QQAccount account) {
		model.addElement(account);
	}
	
}
