import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainFrame extends JFrame implements ActionListener,ItemListener{

	private JButton btnRestart,btnBack,btnFirst,btnPrev;
	private JButton btnNext,btnLast,btnSelect,btnMusic,btnHelp;
	private JComboBox cbMusic;
	private MainPanel mainPanel;
	private String[] musicFile={"nor.mid","qin.mid","popo.mid","guang.mid","eyes on me.mid"};
	private String smusic[]={"Ĭ��","�������","������","��������","eyes on me"};
	private Sound sound;
	public MainFrame() {
		super("2015��������ϷV1.0");
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image icon = tool.getImage("pic/3.gif");
		setIconImage(icon);
		JLabel lblTitle = new JLabel("2015��������ϷV1.0",JLabel.CENTER);
		lblTitle.setForeground(Color.RED);
		Font font = new Font("����",Font.BOLD,28);
		lblTitle.setFont(font);
		
		add(lblTitle,BorderLayout.NORTH);
		btnRestart = new JButton("����");
		btnBack = new JButton("���");
		btnFirst = new JButton("��һ��");
		btnPrev = new JButton("��һ��");
		btnNext = new JButton("��һ��");
		btnLast = new JButton("���һ��");
		btnSelect = new JButton("ѡ��");
		btnMusic = new JButton("���ֹ�");
		cbMusic = new JComboBox(smusic);
		btnHelp = new JButton("����(H)");
		btnHelp.setMnemonic('H');
		JPanel epanel = new JPanel(new GridLayout(11,1,0,20));
		epanel.add(btnRestart);
		epanel.add(btnBack);
		epanel.add(btnFirst);
		epanel.add(btnPrev);
		epanel.add(btnNext);
		epanel.add(btnLast);
		epanel.add(btnSelect);
		epanel.add(btnMusic);
		epanel.add(cbMusic);
		epanel.add(btnHelp);
		add(epanel,BorderLayout.EAST);
		btnRestart.addActionListener(this);
		btnBack.addActionListener(this);
		btnFirst.addActionListener(this);
		btnPrev.addActionListener(this);
		btnNext.addActionListener(this);
		btnLast.addActionListener(this);
		btnSelect.addActionListener(this);
		btnMusic.addActionListener(this);
		btnHelp.addActionListener(this);
		
		mainPanel = new MainPanel();
		sound = new Sound();
		cbMusic.addItemListener(this);
		add(mainPanel);
		setSize(730,650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		mainPanel.requestFocus();//��ȡ����
	}

	public static void main(String[] args) {
		new MainFrame();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRestart){
			mainPanel.init();
		}
		
		if(e.getSource()==btnFirst){
			mainPanel.level=1;
			mainPanel.init();
		}
		if(e.getSource()==btnPrev){
			if(mainPanel.level>1){
				mainPanel.level--;
				mainPanel.init();
			}
		}
		if(e.getSource()==btnNext){
			if(mainPanel.level<11){
				mainPanel.level++;
				mainPanel.init();
			}
		}
		if(e.getSource()==btnLast){
			mainPanel.level=11;
			mainPanel.init();
		}
		if(e.getSource()==btnSelect){
			String slevel=JOptionPane.showInputDialog("������1��11֮��Ĺؿ�.", mainPanel.level);
			if(slevel ==null || slevel.equals(""))
				return;
			int level=0;
			try{
				level  = Integer.parseInt(slevel);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "������1~11֮��Ĺؿ�,��Ҫ����Ƿ��ַ���");
			}
			if(level<1 || level>11){
				JOptionPane.showMessageDialog(null, "������1~11֮��Ĺؿ�");
				return;
			}
			mainPanel.level = level;
			mainPanel.init();
		}
		if(e.getSource()==btnBack){
			mainPanel.back();//��һ��
		}
		mainPanel.requestFocus();
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cbMusic){
			int index=cbMusic.getSelectedIndex();
			System.out.println(musicFile[index]);
			sound.setMusic(musicFile[index]);
			sound.mystop();//ֹͣԭ��������
			sound.loadSound();
		}
		
	}
}
