package com.qq.frame;



import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import com.qq.bean.Message;
import com.qq.bean.QQAccount;
import com.qq.client.QQClient;
import com.qq.listener.FrameMouseMotionListener;
import com.qq.listener.LeaveListener;
import com.qq.listener.MainFrameLblMouseListener;
import com.qq.listener.MinExitLblMouseListener;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 4268814853906125607L;
	
	private QQClient qqClient;
	private QQAccount account;
	
	private JLabel backLbl;
	
	private MainFrameLblMouseListener mfLtn; 
	
	public MainFrame(QQClient qqClient, QQAccount account) {
		this.account = account;
		this.qqClient = qqClient;
		qqClient.setMainFrame(this);
		setSize(300, 600);
		setTitle("QQ 2017");
		setIconImage(new ImageIcon("src/images/qq_icon.png").getImage()); 
		setLocationRelativeTo(null);
		mfLtn = new MainFrameLblMouseListener(qqClient, account);
		getContentPane().setLayout(null);
		setUndecorated(true);
		FrameMouseMotionListener mmLtn = new FrameMouseMotionListener();
		mmLtn.setFrame(this);
		addMouseListener(mmLtn);
		addMouseMotionListener(mmLtn);
		
		initBackground();
		initTop();
		initCenter();
		initBottom();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void initBackground() {
		backLbl = new JLabel(new ImageIcon("src/images/main_bg.png"));
		backLbl.setBounds(new Rectangle(0, 0, this.getWidth(), this.getHeight()));
		add(backLbl);
	}
	
	public void initTop() {//�ϰ벿��
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 120);//x��y��
		panel.setLayout(null);
		panel.setOpaque(false); // false�����ÿؼ�͸����
		JLabel iconLbl = new JLabel(new ImageIcon("src/images/tubiao.png"));
		iconLbl.setBounds(0, 0, 51, 24);//x��y��ͼƬ��С
		panel.add(iconLbl);
		
		JLabel minLbl = new JLabel(new ImageIcon("src/images/min_def.png"));
		minLbl.setName("min");//
		minLbl.setBounds(200, -10, 50, 50);
		MinExitLblMouseListener minExitLtn = new MinExitLblMouseListener();
		minExitLtn.setFrame(this);
		minLbl.addMouseListener(minExitLtn);
		panel.add(minLbl);
		
		JLabel exitLbl = new JLabel(new ImageIcon("src/images/exit_def.png"));
		exitLbl.setName("exit");
		exitLbl.setBounds(250, -10, 50, 50);
		exitLbl.addMouseListener(minExitLtn);
		exitLbl.addMouseListener(new LeaveListener(qqClient, account));
		panel.add(exitLbl);
		initInfo(panel);
		backLbl.add(panel);
	}
	
	private void initInfo(JPanel panel) {
		ImageIcon head = null;
		if (account.getHeadIcon() == null || account.getHeadIcon().equals("")) {
			head = new ImageIcon("src/images/head/head.png");
		} else {
			head = new ImageIcon("src/images/head/" + account.getHeadIcon());
		}
		JLabel headIconLbl = new JLabel(head);
		headIconLbl.setBounds(10, 50, 80, 80);
		panel.add(headIconLbl);
		JLabel nicknameLbl = new JLabel(account.getNickname());
		nicknameLbl.setBounds(110, 50, 120, 30);
		panel.add(nicknameLbl);
		ImageIcon statusIcon = null;
		if (account.getStatus().equals("online")) {
			statusIcon = new ImageIcon("src/images/online.png");
		}
		JLabel statusLbl = new JLabel(statusIcon);
		statusLbl.setBounds(150, 50, 60, 30);
		statusLbl.setName("status");
		statusLbl.addMouseListener(mfLtn);
		panel.add(statusLbl);
	}
	
	private FriendsPanel friendsPanel;
	public void initCenter() {
		UIManager.put("TabbedPane.contentOpaque", Boolean.FALSE); //  ����JTabbedPane�ڲ������ݲ���Ϊ͸��
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 120, 300, 430);
		
		JTabbedPane tabbedPane = new JTabbedPane(); // ѡ��˵������԰�������������еĲ˵�
		tabbedPane.setOpaque(false);
		tabbedPane.setBounds(0, 0, 300, 430);
		// tabbedPane.setBorder(BorderFactory.createLineBorder(Color.GRAY, 0));
		// TODO ����һ��JTabbedPane�ܷ�ȡ���߿�
		friendsPanel = new FriendsPanel(qqClient, account);
		// tabbedPane.add("�ҵĺ���",friendsPanel); // ��һ�������Ǳ��⣬�ڶ���������Ҫ��ʾ�����ݵ����
		tabbedPane.addTab("", new ImageIcon("src/images/xunzhang.png"), friendsPanel, "�ҵ�QQ����");
		tabbedPane.add("Ⱥ", new JPanel());
		panel.add(tabbedPane);
		backLbl.add(panel);
	}
	
	private JLabel noticeLbl;
	private boolean noticed = false;
	
	public boolean isNoticed() {
		return noticed;
	}

	public void setNoticed(boolean noticed) {
		this.noticed = noticed;
	}
	private NoticeThread noticeThread = new NoticeThread();
	public void initBottom() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 550, 300, 50);
		panel.setLayout(null);
		panel.setOpaque(false);
		JLabel searchLbl = new JLabel(new ImageIcon("src/images/search_def.png"));
		searchLbl.setBounds(20, 10, 50, 25);
		searchLbl.setName("search");
		mfLtn.setMainFrame(this);
		mfLtn.setNoticeThread(noticeThread);
		searchLbl.addMouseListener(mfLtn);
		noticeLbl = new JLabel(new ImageIcon("src/images/busy.png"));
		noticeLbl.setBounds(100, 10, 30, 30);
		noticeLbl.setName("notice");
		noticeLbl.addMouseListener(mfLtn);
		panel.add(searchLbl);
		panel.add(noticeLbl);
		backLbl.add(panel);
	}
	
	/**
	 * ����һ���̣߳���ͣ���л�֪ͨͼ�ֱ꣬���û������֪ͨͼ�꣬�򵯳�һ����Ӻ��ѵĴ���
	 */
	public void updateNotice(Message message) {
		noticeThread.setNoticeLbl(noticeLbl);
		mfLtn.setMessage(message);
		noticed = true;
		new Thread(noticeThread).start();
	}

	/**
	 * һ������ͬ�������Ϊ���ѣ�����ô˷��������º����б� 
	 * @param from
	 */
	public void updateFriendList(QQAccount from) {
		friendsPanel.updateFriendList(from); // ����FriendsPanel��ĸ��º����б�ķ���
	}

}
