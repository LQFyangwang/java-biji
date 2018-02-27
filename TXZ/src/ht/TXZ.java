package ht;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TXZ extends JFrame{
	GamePanel zhongjian;
	TXZ(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(705, 680);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//顶端面板
		JPanel dingbu = new JPanel(new FlowLayout(FlowLayout.CENTER)); //流布局居中
		dingbu.setBackground(Color.YELLOW);  //设置面板的背景颜色
		JLabel label = new JLabel("推箱子");//显示的文字
		label.setFont(new Font("宋体", Font.BOLD, 25)); //设置文字字体
		label.setForeground(Color.RED); //设置文字颜色
		dingbu.add(label); //将标签添加到面板
		
		JPanel youbian = new JPanel(new GridLayout(15, 1, 10, 10)); //网格布局，15行1列，每个网格距离是10像素
		JButton btn1 = new JButton("重   来");
		btn1.setActionCommand("chonglai");
		btn1.addActionListener(new AL());
		
		JButton btn2 = new JButton("悔一步");
		btn2.setActionCommand("hyb");
		btn2.addActionListener(new AL());
		
		JButton btn3 = new JButton("第一关");
		btn3.setActionCommand("diyiguan");
		btn3.addActionListener(new AL());
		
		JButton btn4 = new JButton("上一关");
		btn4.setActionCommand("shangyiguan");
		btn4.addActionListener(new AL());
		
		JButton btn5 = new JButton("下一关");
		btn5.setActionCommand("xiayiguan");
		btn5.addActionListener(new AL());
		
		JButton btn6 = new JButton("最后一关");
		btn6.setActionCommand("zuihouyiguan");
		btn6.addActionListener(new AL());
		
		JButton btn7 = new JButton("选    关");
		btn7.setActionCommand("xuanguan");
		btn7.addActionListener(new AL());
		
		JButton btn8 = new JButton("帮    助");
		youbian.add(btn1);
		youbian.add(btn2);
		youbian.add(btn3);
		youbian.add(btn4);
		youbian.add(btn5);
		youbian.add(btn6);
		youbian.add(btn7);
		youbian.add(btn8);
		
		zhongjian = new GamePanel();
		
		c.add(dingbu, BorderLayout.NORTH); //放置到顶层的面板的上方
		c.add(youbian, BorderLayout.EAST); //放置到顶层的面板的右边
		c.add(zhongjian, BorderLayout.CENTER); //放置到顶层的面板的中间
		
		setVisible(true);
	}
	
	class AL implements ActionListener{   //按钮监听器
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("chonglai")){
				zhongjian.setLevel(zhongjian.getLevel());
			}else if(cmd.equals("diyiguan")){
				zhongjian.setLevel(1);
			}else if(cmd.equals("shangyiguan")){
				if(zhongjian.getLevel()>1){
					zhongjian.setLevel(zhongjian.getLevel()-1);
				}
			}else if(cmd.equals("xiayiguan")){
				zhongjian.setLevel(zhongjian.getLevel()+1);
			}else if(cmd.equals("zuihouyiguan")){
				zhongjian.setLevel(11);
			}else if(cmd.equals("hyb")){
				zhongjian.huiyibu();
			}else if(cmd.equals("xuanguan")){
				String strLevel = JOptionPane.showInputDialog("请输入要进入的关卡(1-11)");  //获取玩家输入的关卡数
				int level = Integer.parseInt(strLevel); //将字符串型的关卡数转换成整形的关卡数
				zhongjian.setLevel(level);
			}
		}
	}
	public static void main(String[] args) {
		new TXZ();
	}
}
