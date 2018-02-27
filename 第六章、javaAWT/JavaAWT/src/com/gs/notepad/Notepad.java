package com.gs.notepad;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;

public class Notepad extends Frame implements ActionListener {

	private static final long serialVersionUID = 3474486011339893915L;
	
	public Notepad() {
		setSize(600, 400);
		setTitle("记事本");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		initWidgets();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Notepad.this.dispose();
			}
		});
		setVisible(true);
	}
	
	private void initWidgets() {
		// 多个菜单项(MenuItem)组成一个菜单(Menu)，多个菜单（Menu）组成一个MenuBar
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("文件(F)");
		MenuItem newFile = new MenuItem("新建(N)");
		newFile.addActionListener(this);
		newFile.setActionCommand("new");
		MenuItem saveFile = new MenuItem("保存(S)");
		saveFile.setActionCommand("save");
		saveFile.addActionListener(this);
		fileMenu.add(newFile);
		fileMenu.addSeparator(); // 添加分隔线
		fileMenu.add(saveFile);
		Menu editMenu = new Menu("编辑(E)");
		MenuItem copyItem = new MenuItem("复制(C)");
		copyItem.addActionListener(this);
		copyItem.setActionCommand("copy");
		editMenu.add(copyItem);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		setMenuBar(menuBar);
		TextArea txt = new TextArea(10, 40);
		txt.setFont(new Font("微软雅黑", Font.BOLD | Font.ITALIC, 14));
		add(txt, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand != null) {
			if (actionCommand.equals("new")) {
				System.out.println("点击的新建菜单项");
			} else if (actionCommand.equals("copy")) {
				System.out.println("点击了复制菜单项");
			} else if (actionCommand.equals("save")) {
				System.out.println("保存文件");
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Notepad();
			}
			
		});
	}

}
