package com.ht.qq.ui;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MainUi extends JFrame implements MouseListener {
	private static final long serialVersionUID = 1L;
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width - 260;
	JLabel lblbg, show;

	public MainUi() {
		super("QQ2018");
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Image img = Toolkit.getDefaultToolkit().getImage("images/3.jpg");// ±ÍÃ‚Õº±Í
		setIconImage(img);
		Container c = getContentPane();
		// ±≥æ∞
		lblbg = new JLabel(new ImageIcon("images/bg_0.jpg"));
		c.add(lblbg);

		show = new JLabel(new ImageIcon("images/show.png"));
		show.addMouseListener(this);
		lblbg.add(show);
		show.setBounds(150, 5, 60, 60);

		setLocation(width, 30);
		setSize(250, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MainUi();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == show) {
			if (e.getClickCount() == 1) {

				lblbg.setIcon(new ImageIcon("images/bg_1.jpg"));

			}
			if (e.getClickCount() == 2) {

				lblbg.setIcon(new ImageIcon("images/bg_2.jpg"));

			}
			if (e.getClickCount() == 3) {

				lblbg.setIcon(new ImageIcon("images/bg_3.jpg"));

			}
			if (e.getClickCount() == 4) {

				lblbg.setIcon(new ImageIcon("images/bg_4.jpg"));

			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
