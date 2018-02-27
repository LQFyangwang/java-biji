package com.ht.qq.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class LoginUi extends JFrame implements MouseListener{
	private JLabel lblbg,lblQQnum,lblpwd,lblFace;
	private JComboBox cbQQcode;
	private JPasswordField txtpwd;
	private JButton btnLogin,btnCancel;
	private JLabel lblReg,lblForgetpwd;
	public LoginUi() {
		super("QQ");
		lblbg = new JLabel(new ImageIcon("images/bg.png"));
		add(lblbg);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		lblQQnum = new JLabel("ÕËºÅ:",JLabel.RIGHT);
		lblpwd = new JLabel("ÃÜÂë:",JLabel.RIGHT);
		cbQQcode = new JComboBox();
		cbQQcode.setEditable(true);//ÏÂÀ­ÊäÈë¿ò
		txtpwd = new JPasswordField();
		lblFace = new JLabel(new ImageIcon("images/tubiao.png"));
		btnLogin = new JButton("µÇÂ½(L)");
		btnLogin.setMnemonic('L');//ÉèÖÃ¿ì½Ý¼ü
		btnCancel = new JButton("¹Ø±Õ(X)");
		btnCancel.setMnemonic('X');
		lblReg = new JLabel("×¢        ²á",JLabel.RIGHT);
		lblForgetpwd = new JLabel("ÕÒ»ØÃÜÂë",JLabel.RIGHT);
		
		lblQQnum.setSize(60, 30);
		lblpwd.setSize(60, 30);
		cbQQcode.setSize(150, 30);
		txtpwd.setSize(150, 30);
		btnLogin.setSize(80, 30);
		btnCancel.setSize(80, 30);
		lblReg.setSize(60, 30);
		lblForgetpwd.setSize(60, 30);
		lblFace.setSize(60, 60);
		
		lblQQnum.setLocation(70,190);
		cbQQcode.setLocation(130,190);
		lblpwd.setLocation(70,230);
		txtpwd.setLocation(130,230);
		btnLogin.setLocation(120,295);
		btnCancel.setLocation(220,295);
		lblReg.setLocation(280,190);
		lblForgetpwd.setLocation(280,230);
		lblFace.setLocation(30, 200);
		
		lblbg.add(lblQQnum);
		lblbg.add(cbQQcode);
		lblbg.add(lblpwd);
		lblbg.add(txtpwd);
		lblbg.add(btnLogin);
		lblbg.add(btnCancel);
		lblbg.add(lblReg);
		lblbg.add(lblForgetpwd);
		lblbg.add(lblFace);
		//Ìí¼Ó¼àÌý
		lblReg.addMouseListener(this);
		btnLogin.addMouseListener(this);
		btnCancel.addMouseListener(this);
		
		setUndecorated(true);//È¥³ý±ß¿ò
		setResizable(false);
		setSize(440, 360);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new LoginUi();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lblReg){
			new RegUi();
		}else if(e.getSource()==btnLogin){
			this.dispose();
			new MainUi();
		}else if(e.getSource()==btnCancel){
			System.exit(0);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
