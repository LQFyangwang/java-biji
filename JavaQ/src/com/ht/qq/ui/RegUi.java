package com.ht.qq.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;


import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
public class RegUi extends JFrame{

	private JLabel lblbg;//背景图片
	private JComboBox cbface,nation,star;
	private JTextField qqCode,nickName,port,age,remark,ipAddr;
	private JRadioButton sex1,sex2;
	private JTextArea selfsign;
	private JPasswordField pwd,cfgpwd;
	private JButton btnSave,btnClose;
	private String stars[]={"白羊座","金牛座","双子座","巨蟹座",
			"狮子座","处女座","天秤座","天蝎座",
			"射手座","摩羯座","水瓶座","双鱼座",};
	private String nations[]={"汉族","壮族","满族","回族","苗族","维吾尔族","土家族",
		  "彝族","蒙古族","藏族","布依族","侗族","瑶族","朝鲜族",
		  "白族","哈尼族","哈萨克族","黎族","傣族","畲族","傈僳族",
		  "仡佬族","东乡族","高山族","拉祜族","水族","佤族","纳西族",
		  "羌族","土族","仫佬族","锡伯族","柯尔克孜族","达斡尔族","景颇族",
		  "毛南族","撒拉族","布朗族","塔吉克族","阿昌族","普米族","鄂温克族",
		  "怒族","京族","基诺族","德昂族","保安族","俄罗斯族","裕固族 ",
		  "乌兹别克族","门巴族","鄂伦春族","独龙族","塔塔尔族","赫哲族","珞巴族"};
	private String [] faces={
			"face/0.jpg",
			"face/1.jpg",
			"face/2.jpg",
			"face/3.jpg",
			"face/4.jpg",
			"face/5.jpg",
			"face/6.jpg",
			"face/7.jpg",
			"face/8.jpg",
			"face/9.jpg"
	};
	//初始化界面
	public RegUi() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e) {
			e.printStackTrace();
		}
		Icon bgimg = new ImageIcon("images/1.gif");
		lblbg = new JLabel(bgimg);
		add(lblbg);
		JLabel lblTitle = new JLabel("个人资料");
		lblTitle.setFont(new Font("华文行楷",Font.BOLD,36));
		lblTitle.setBounds(170, 30, 250, 30);
		lblTitle.setForeground(Color.cyan);
		lblbg.add(lblTitle);
		lblbg.setBorder(BorderFactory.createBevelBorder(2));
		int i=0;
		Icon [] face={
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++]),
				new ImageIcon(faces[i++])
				
		};
		cbface = new JComboBox(face);
		cbface.setMaximumRowCount(5);
		JLabel lblface = new JLabel("头像：",JLabel.RIGHT);
		lblface.setForeground(Color.cyan);
		lblface.setBounds(270, 100, 60, 25);
		cbface.setBounds(330,100,90,60);
		lblbg.add(lblface);
		lblbg.add(cbface);
		JLabel lblqqcode = new JLabel("QQ号码：",JLabel.RIGHT);
		JLabel lblnickName = new JLabel("昵称：",JLabel.RIGHT);
		JLabel lblpwd = new JLabel("登陆密码：",JLabel.RIGHT);
		JLabel lblcfgpwd = new JLabel("确认密码：",JLabel.RIGHT);
		JLabel lblipAddr = new JLabel("本机地址：",JLabel.RIGHT);
		JLabel lblport = new JLabel("连接端口：",JLabel.RIGHT);
		JLabel lblage = new JLabel("年龄：",JLabel.RIGHT);
		JLabel lblsex = new JLabel("性别：",JLabel.RIGHT);
		JLabel lblnation = new JLabel("民族：",JLabel.RIGHT);
		JLabel lblstar = new JLabel("星座：",JLabel.RIGHT);
		JLabel lblremark = new JLabel("备注：",JLabel.RIGHT);
		JLabel lblselfsign = new JLabel("个性签名：",JLabel.RIGHT);
		qqCode = new JTextField(15);
		qqCode.setBackground(new Color(0,0,0,0));
		lblqqcode.setBounds(50, 100, 60, 25);
		qqCode.setBounds(110, 100, 100, 25);
		
		lblbg.add(lblqqcode);
		lblbg.add(qqCode);
		nickName = new JTextField(15);
		nickName.setBackground(new Color(0,0,0,0));//透明化处理
		lblnickName.setBounds(50, 140, 60, 25);
		nickName.setBounds(110, 140, 100, 25);
		
		lblbg.add(lblnickName);
		lblbg.add(nickName);
		pwd = new JPasswordField(15);
		pwd.setBackground(new Color(0,0,0,0));
		cfgpwd = new JPasswordField(15);
		cfgpwd.setBackground(new Color(0,0,0,0));
		lblpwd.setBounds(50, 180, 60, 25);
		pwd.setBounds(110, 180, 100, 25);
		
		lblcfgpwd.setBounds(270, 180, 60, 25);
		cfgpwd.setBounds(330, 180, 100, 25);
		
		lblbg.add(lblpwd);
		lblbg.add(pwd);
		lblbg.add(lblcfgpwd);
		lblbg.add(cfgpwd);
		//获取本机IP地址
//		InetAddress addr=null;
//		try{
//			addr = InetAddress.getLocalHost();
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
//		ipAddr = new JTextField(addr.getHostAddress());
		ipAddr = new JTextField("127.0.0.1");
		ipAddr.setBackground(new Color(0,0,0,0));
		ipAddr.setEditable(false);//只读
		lblipAddr.setBounds(50, 220, 60, 25);
		ipAddr.setBounds(110, 220, 100, 25);
		
		lblbg.add(lblipAddr);
		lblbg.add(ipAddr);
		port = new JTextField();
		port.setBackground(new Color(0,0,0,0));
		lblport.setBounds(270, 220, 60, 25);
		port.setBounds(330, 220, 100, 25);
		
		lblbg.add(lblport);
		lblbg.add(port);
		age = new JTextField("1");
		age.setBackground(new Color(0,0,0,0));
		lblage.setBounds(50, 260, 60, 25);
		age.setBounds(110, 260, 60, 25);
		
		lblbg.add(lblage);
		lblbg.add(age);
		sex1 = new JRadioButton("男");
		sex2 = new JRadioButton("女");
		sex2.setSelected(true);//默认选中
		lblsex.setBounds(270, 260, 60, 25);
		
		sex1.setBounds(330, 260, 60, 25);
		sex1.setForeground(Color.cyan);
		sex2.setBounds(390, 260, 60, 25);
		sex2.setForeground(Color.cyan);
		ButtonGroup bg = new ButtonGroup();//加到一组才能单选
		bg.add(sex1);
		bg.add(sex2);
		lblbg.add(lblsex);
		lblbg.add(sex1);
		lblbg.add(sex2);
		
		nation = new JComboBox(nations);
		nation.setBackground(new Color(0,0,0,0));
		lblnation.setBounds(50, 300, 60, 25);
		nation.setBounds(110, 300, 100, 25);
		
		lblbg.add(lblnation);
		lblbg.add(nation);
		star = new JComboBox(stars);
		lblstar.setBounds(270, 300, 60, 25);
		star.setBounds(330, 300, 100, 25);
		
		lblbg.add(lblstar);
		lblbg.add(star);
		remark = new JTextField();
		remark.setBackground(new Color(0,0,0,0));
		lblremark.setBounds(50, 340, 60, 25);
		remark.setBounds(110, 340, 320, 25);
		
		lblbg.add(lblremark);
		lblbg.add(remark);
		selfsign = new JTextArea();
//		selfsign.setBackground(new Color(0,0,0,0));
		lblselfsign.setBounds(50, 380, 60, 25);
		selfsign.setBounds(110, 380, 320, 80);
		
		JScrollPane spanel = new JScrollPane(selfsign);
		spanel.setBounds(110, 380, 320, 80);
		lblbg.add(lblselfsign);
		lblbg.add(spanel);
		btnSave = new JButton("注册");
		btnClose = new JButton("关闭");
		btnSave.setBounds(250, 490, 80, 30);
		btnClose.setBounds(380, 490, 80, 30);
		lblbg.add(btnSave);
		lblbg.add(btnClose);
		setResizable(false);//不能更改窗口大小
		setSize(500, 570);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关闭当前窗口
		
	}
}
