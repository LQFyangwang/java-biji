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
		
		//�������
		JPanel dingbu = new JPanel(new FlowLayout(FlowLayout.CENTER)); //�����־���
		dingbu.setBackground(Color.YELLOW);  //�������ı�����ɫ
		JLabel label = new JLabel("������");//��ʾ������
		label.setFont(new Font("����", Font.BOLD, 25)); //������������
		label.setForeground(Color.RED); //����������ɫ
		dingbu.add(label); //����ǩ��ӵ����
		
		JPanel youbian = new JPanel(new GridLayout(15, 1, 10, 10)); //���񲼾֣�15��1�У�ÿ�����������10����
		JButton btn1 = new JButton("��   ��");
		btn1.setActionCommand("chonglai");
		btn1.addActionListener(new AL());
		
		JButton btn2 = new JButton("��һ��");
		btn2.setActionCommand("hyb");
		btn2.addActionListener(new AL());
		
		JButton btn3 = new JButton("��һ��");
		btn3.setActionCommand("diyiguan");
		btn3.addActionListener(new AL());
		
		JButton btn4 = new JButton("��һ��");
		btn4.setActionCommand("shangyiguan");
		btn4.addActionListener(new AL());
		
		JButton btn5 = new JButton("��һ��");
		btn5.setActionCommand("xiayiguan");
		btn5.addActionListener(new AL());
		
		JButton btn6 = new JButton("���һ��");
		btn6.setActionCommand("zuihouyiguan");
		btn6.addActionListener(new AL());
		
		JButton btn7 = new JButton("ѡ    ��");
		btn7.setActionCommand("xuanguan");
		btn7.addActionListener(new AL());
		
		JButton btn8 = new JButton("��    ��");
		youbian.add(btn1);
		youbian.add(btn2);
		youbian.add(btn3);
		youbian.add(btn4);
		youbian.add(btn5);
		youbian.add(btn6);
		youbian.add(btn7);
		youbian.add(btn8);
		
		zhongjian = new GamePanel();
		
		c.add(dingbu, BorderLayout.NORTH); //���õ�����������Ϸ�
		c.add(youbian, BorderLayout.EAST); //���õ�����������ұ�
		c.add(zhongjian, BorderLayout.CENTER); //���õ�����������м�
		
		setVisible(true);
	}
	
	class AL implements ActionListener{   //��ť������
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
				String strLevel = JOptionPane.showInputDialog("������Ҫ����Ĺؿ�(1-11)");  //��ȡ�������Ĺؿ���
				int level = Integer.parseInt(strLevel); //���ַ����͵Ĺؿ���ת�������εĹؿ���
				zhongjian.setLevel(level);
			}
		}
	}
	public static void main(String[] args) {
		new TXZ();
	}
}
