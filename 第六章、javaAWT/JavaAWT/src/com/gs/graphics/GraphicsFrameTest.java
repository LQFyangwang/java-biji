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
		// super.paint(g); // 放在第一行OK
		g.setColor(Color.RED); // 设置画笔的颜色
		g.drawLine(100, 100, 200, 200); // 绘制直线
		g.drawRect(200, 200, 200, 100); // 绘制矩形
		g.drawString("你好，图形图像", 100, 300); // 绘制文字
		g.setColor(Color.GREEN);
		g.draw3DRect(400, 200, 200, 100, true); // 绘制增加有一个像素的阴影的矩形 
		g.drawRect(100, 300, 300, 100);
		g.drawArc(100, 300, 300, 100, 90, 180); // 以指定矩形的中心点来绘制弧
		g.drawBytes(new byte[]{1, 2, 3}, 1, 2, 100, 450); // 在给定的byte数组中，从offset位置开始绘制length个byte，对于byte，如果byte没有特殊的含义，则画方框
		g.drawChars(new char[]{'a', 'b', 'c', 100}, 0, 4, 150, 450); // 正常地绘制字符
		g.drawOval(100, 500, 200, 100); // 在指定的矩形内以矩形的中心点为圆心画圆形，如果是正文形，则画一个正圆
		g.drawPolygon(new int[]{100, 200, 210, 300}, new int[]{500, 550, 600, 560}, 4); // 第一个参数是x坐标的数组，第二个参数是y坐标的数组，第三个参数指定连接多少个点，按点的索引顺序把点连接在一起
		g.drawPolyline(new int[]{400, 430, 450}, new int[]{500, 550, 600}, 3); // 不会对起始点和终点进行连接
		g.drawRoundRect(400, 500, 200, 200, 50, 20); // 圆角矩形，第5个参数指定横向的值，第6个参数指定纵向的值
		
		// Image img = Toolkit.getDefaultToolkit().getImage("D:/workspace/JavaAWT/a.jpg");
		try {
			BufferedImage img = ImageIO.read(new File("src/images/a.jpg"));
			g.drawImage(img, 500, 200, null);
		} catch (IOException e) { // 输入输出异常
			e.printStackTrace();
		}
		// super.paint(g); // 放在最后一行也OK
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
