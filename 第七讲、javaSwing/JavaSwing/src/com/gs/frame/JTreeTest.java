package com.gs.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTreeTest extends JFrame {

	private static final long serialVersionUID = -9062663159009059291L;
	
	public JTreeTest() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		
//		JTree tree = new JTree(new String[]{"a", "b", "c"});
//		add(tree);
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("a"); // �������ĸ��ڵ�
		DefaultMutableTreeNode rootChild1 = new DefaultMutableTreeNode("a-1");
		rootChild1.add(new DefaultMutableTreeNode("a-1-1"));
		root.add(rootChild1); // ����ӽڵ�
		root.add(new DefaultMutableTreeNode("a-2"));
		JTree tree = new JTree(root);
		tree.addTreeSelectionListener(new TreeSelectionListener() {

			@Override
			public void valueChanged(TreeSelectionEvent e) {
				TreePath path = e.getPath(); // ��ȡ���ڵ�����ɵ�·�� 
				System.out.println(path);
				Object[] obj = path.getPath(); // TreePath��ȡ���Ǵӵ�һ������ʼ����������Ǹ���������ݣ�ÿһ����������ݰ�˳��ŵ�������
				if (obj.length == 2) {
					DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) obj[1];
					if (treeNode.getUserObject().toString().equals("a-1")) {
						System.out.println("ѡ����a-1");
					}
				}
			}
			
		}); // ���Ľڵ�ѡ���¼�
		add(tree);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JTreeTest();
			}
		});
	}

}
