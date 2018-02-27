package ht;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	public static final int UP = 1;     //��
	public static final int DOWN = 2;   //��
	public static final int LEFT = 3;   //��
	public static final int RIGHT = 4;  //��
	
	public static final int BEI_JING = 0; //����
	public static final int WEI_QIANG = 1; //Χǽ
	public static final int CAO_DI = 2; //�ݵ�
	public static final int XIANG_ZI = 3; //��ɫ����
	public static final int MU_DI_DI = 4; //Ŀ�ĵ�
	public static final int REN = 5; //��
	public static final int XIANGZI_MUDIDI = 9; //��ɫ���ӣ���ɫ���Ӻ�Ŀ�ĵص��غ�
	
	public Stack steps = new Stack(); //������Ϸ�����в�����ӵ�ջ
	
	final Image imges[] = {
			new ImageIcon("0.gif").getImage(),
			new ImageIcon("1.gif").getImage(),
			new ImageIcon("2.gif").getImage(),
			new ImageIcon("3.gif").getImage(),
			new ImageIcon("4.gif").getImage(),
			new ImageIcon("5.gif").getImage(),
			new ImageIcon("6.gif").getImage(),
			new ImageIcon("7.gif").getImage(),
			new ImageIcon("8.gif").getImage(),
			new ImageIcon("9.gif").getImage()
	};
	
	int level = 1;  //Ĭ���ǵ�һ��
	int map[][], yuansi_map[][];    //��ͼ��ԭʼ��ͼ
	int direction = DOWN;  //����
	int renI, renJ;   //���ڵڼ��У��ڼ���
	int qian1I, qian1J;     //��ǰ���һ���ǵڼ��еڼ���
	int qian2I, qian2J;     //��ǰ��ڶ����ǵڼ��еڼ���
	
	GamePanel(){   //���캯��
		initPanel();  //���ó�ʼ��������
		addMouseListener(new ML());  //������������ӵ����
		addKeyListener(new KL());    //�����̼�������ӵ����
	}
	
	//�Զ��巽����������ʼ����Ϸ���
	public void initPanel(){
		map = DiTu.getMap(level);   //��ȡ��ͼ
		yuansi_map = DiTu.getMap(level); //��ȡ��ͼ
	}
	
	public void getHangLie(){
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if(map[i][j]==REN){    //������ڵڼ��еڼ���
					renI = i; 
					renJ = j;
					break;
				}
			}
		}
		if (direction == UP) {     //�����ϻ��������ߣ��в��䣬�иı�
			qian1I = renI - 1;
			qian1J = renJ;
			qian2I = renI - 2;
			qian2J = renJ;
		} else if (direction == DOWN) {
			qian1I = renI + 1;
			qian1J = renJ;
			qian2I = renI + 2;
			qian2J = renJ;
		} else if (direction == LEFT) {//��������������ߣ��в��䣬�иı�
			qian1I = renI;
			qian1J = renJ - 1;
			qian2I = renI;
			qian2J = renJ - 2;
		} else if (direction == RIGHT) {
			qian1I = renI;
			qian1J = renJ + 1;
			qian2I = renI;
			qian2J = renJ + 2;
		}
	}
	
	public void huiyibu(){   //��һ��
		if(steps.size()<=0){
			JOptionPane.showMessageDialog(GamePanel.this, "û�в�����Ի���");
			return;   //ʵ������������Ч��
		}
		Step step = (Step)steps.pop();
		map = step.map;
		direction = step.derection;
		GamePanel.this.repaint();
	}
	
	public void move(){
		//��ǰ���ǲݵػ���Ŀ�ĵ�
		if(map[qian1I][qian1J]==CAO_DI || map[qian1I][qian1J]==MU_DI_DI){
			map[renI][renJ]=getYuanSiDitu(renI, renJ);  //��ԭ����վ��λ�û�ԭ�����Ķ���
			map[qian1I][qian1J] = REN; //��ǰһ������
			
			Step step = new Step();      //��ÿһ����Ϸ���豣������
			steps.push(step.copy(map, direction));
		}
		//��ǰ���һ���ǻ�ɫ���ӻ��ߺ�ɫ���ӣ�����ǰ��ڶ����ǲݵػ���Ŀ�ĵ�
		else if(map[qian1I][qian1J]==XIANG_ZI || map[qian1I][qian1J]==XIANGZI_MUDIDI){
			if(map[qian2I][qian2J]==CAO_DI){  //ǰ��ڶ����ǲݵ�
				map[renI][renJ]=getYuanSiDitu(renI, renJ);
				map[qian1I][qian1J] = REN; //��ǰһ������
				map[qian2I][qian2J] = XIANG_ZI; //��ǰ��ڶ���������
				
				Step step = new Step();      //��ÿһ����Ϸ���豣������
				steps.push(step.copy(map, direction));
			}
			else if(map[qian2I][qian2J]==MU_DI_DI){ //ǰ��ڶ�����Ŀ�ĵ�
				map[renI][renJ]=getYuanSiDitu(renI, renJ);
				map[qian1I][qian1J] = REN; //��ǰһ������
				map[qian2I][qian2J] = XIANGZI_MUDIDI; //��ǰ��ڶ���������
				
				Step step = new Step();      //��ÿһ����Ϸ���豣������
				steps.push(step.copy(map, direction));
			}
		}
	}
	
	//�������±�����±��ȡԭʼ��ͼ
	public int getYuanSiDitu(int i, int j){
		if(yuansi_map[i][j]==REN || yuansi_map[i][j]==XIANG_ZI){
			return CAO_DI;
		}
		else if(yuansi_map[i][j]==XIANGZI_MUDIDI){
			return MU_DI_DI;
		}
		return yuansi_map[i][j];
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				int left = j*30;
				int top = i*30;
				int zhi = map[i][j];
				if(map[i][j]==REN){
					if(direction==UP){
						g.drawImage(imges[8], left, top, 30, 30, GamePanel.this);
					}
					else if(direction==DOWN){
						g.drawImage(imges[5], left, top, 30, 30, GamePanel.this);
					}
					else if(direction==LEFT){
						g.drawImage(imges[6], left, top, 30, 30, GamePanel.this);
					}
					else if(direction==RIGHT){
						g.drawImage(imges[7], left, top, 30, 30, GamePanel.this);
					}
				}else{
					g.drawImage(imges[zhi], left, top, 30, 30, GamePanel.this);
				}
			}
		}
	}
	
	public void setLevel(int level){  //���ùؿ�
		this.level = level;
		map = DiTu.getMap(level);
		yuansi_map = DiTu.getMap(level);
		GamePanel.this.repaint();
	}
	
	public int getLevel(){  //�õ���ǰ�ǵڼ���
		return level;
	}
	
	class ML extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {  //���������
			GamePanel.this.requestFocus(); //���������Ϸ���ʱ��ý���
		}
	}
	
	class KL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {   //�������̰���
			int code = e.getKeyCode(); //��ð���ֵ
			if(code==KeyEvent.VK_UP){  //������µ������ϵļ�
				direction = UP;
			}
			else if(code==KeyEvent.VK_DOWN){ //������µ������µļ�
				direction = DOWN;
			}
			else if(code==KeyEvent.VK_LEFT){ //������µ�������ļ�
				direction = LEFT;
			}
			else if(code==KeyEvent.VK_RIGHT){ //������µ������ҵļ�
				direction = RIGHT;
			}
			getHangLie();   //ÿ�θı䷽��ʱ��ͬʱ�ı�ǰ��һ��ͺ���һ��������±�
			move();  //�ƶ�
			GamePanel.this.repaint(); //���ƶ�֮�����»�����Ϸ���
			
			if(isWin()){   //������һ��
				steps.clear();  //ÿ������һ��Ҫ������һ�صĲ���
				level++;
				map = DiTu.getMap(level);
				yuansi_map = DiTu.getMap(level);
				GamePanel.this.repaint();
			}
		}
	}
	
	public boolean isWin(){ //�ж���û��ͨ����
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if(map[i][j]==XIANG_ZI){  //��������ڻ�ɫ���ӣ���ô��û�й���
					return false;
				}
			}
		}
		return true;
	}
	
	//��¼ÿһ����Ϣ����
	class Step{
		int map[][] = new int[20][20];   //ÿһ���ĵ�ͼ
		int derection; //ÿһ���ķ���
		
		public Step copy(int ditu[][], int direct){
			for(int i=0; i<20; i++){
				for(int j=0; j<20; j++){
					map[i][j] = ditu[i][j];
				}
			}
			derection = direct;
			return this;
		}
	}
}
