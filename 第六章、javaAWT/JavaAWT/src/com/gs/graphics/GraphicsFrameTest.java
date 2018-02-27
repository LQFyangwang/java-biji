package com.gs.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class GraphicsFrameTest extends Frame {

	private static final long serialVersionUID = -3577602138009427366L;
	
	private Panel panel;
	
	public GraphicsFrameTest() {
		setSize(800, 800);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		//initPanel();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				GraphicsFrameTest.this.dispose();
			}
		});
		setVisible(true);
	}
	
	@SuppressWarnings("unused")
	private void initPanel() {
		panel = new Panel();
		
		add(panel, BorderLayout.CENTER);
	}

	@Override
	public void paint(Graphics g) {
		// super.paint(g); // ���ڵ�һ��OK
		g.setColor(Color.RED); // ���û��ʵ���ɫ
		g.drawLine(100, 100, 200, 200); // ����ֱ��
		g.drawRect(200, 200, 200, 100); // ���ƾ���
		g.drawString("��ã�ͼ��ͼ��", 100, 300); // ��������
		g.setColor(Color.GREEN);
		g.draw3DRect(400, 200, 200, 100, true); // ����������һ�����ص���Ӱ�ľ��� 
		g.drawRect(100, 300, 300, 100);
		g.drawArc(100, 300, 300, 100, 90, 180); // ��ָ�����ε����ĵ������ƻ�
		g.drawBytes(new byte[]{1, 2, 3}, 1, 2, 100, 450); // �ڸ�����byte�����У���offsetλ�ÿ�ʼ����length��byte������byte�����byteû������ĺ��壬�򻭷���
		g.drawChars(new char[]{'a', 'b', 'c', 100}, 0, 4, 150, 450); // �����ػ����ַ�
		g.drawOval(100, 500, 200, 100); // ��ָ���ľ������Ծ��ε����ĵ�ΪԲ�Ļ�Բ�Σ�����������Σ���һ����Բ
		g.drawPolygon(new int[]{100, 200, 210, 300}, new int[]{500, 550, 600, 560}, 4); // ��һ��������x��������飬�ڶ���������y��������飬����������ָ�����Ӷ��ٸ��㣬���������˳��ѵ�������һ��
		g.drawPolyline(new int[]{400, 430, 450}, new int[]{500, 550, 600}, 3); // �������ʼ����յ��������
		g.drawRoundRect(400, 500, 200, 200, 50, 20); // Բ�Ǿ��Σ���5������ָ�������ֵ����6������ָ�������ֵ
		
		// Image img = Toolkit.getDefaultToolkit().getImage("D:/workspace/JavaAWT/a.jpg");
		try {
			BufferedImage img = ImageIO.read(new File("src/images/a.jpg"));
			g.drawImage(img, 500, 200, null);
		} catch (IOException e) { // ��������쳣
			e.printStackTrace();
		}
		// super.paint(g); // �������һ��ҲOK
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GraphicsFrameTest();
			}
			
		});
	}

}
