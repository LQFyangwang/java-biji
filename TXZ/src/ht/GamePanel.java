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
	public static final int UP = 1;     //上
	public static final int DOWN = 2;   //下
	public static final int LEFT = 3;   //左
	public static final int RIGHT = 4;  //右
	
	public static final int BEI_JING = 0; //背景
	public static final int WEI_QIANG = 1; //围墙
	public static final int CAO_DI = 2; //草地
	public static final int XIANG_ZI = 3; //黄色箱子
	public static final int MU_DI_DI = 4; //目的地
	public static final int REN = 5; //人
	public static final int XIANGZI_MUDIDI = 9; //红色箱子：黄色箱子和目的地的重合
	
	public Stack steps = new Stack(); //将玩游戏的所有步骤添加到栈
	
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
	
	int level = 1;  //默认是第一关
	int map[][], yuansi_map[][];    //地图和原始地图
	int direction = DOWN;  //方向
	int renI, renJ;   //人在第几行，第几列
	int qian1I, qian1J;     //人前面第一格是第几行第几列
	int qian2I, qian2J;     //人前面第二格是第几行第几列
	
	GamePanel(){   //构造函数
		initPanel();  //调用初始化化方法
		addMouseListener(new ML());  //将鼠标监听器添加到面板
		addKeyListener(new KL());    //将键盘监听器添加到面板
	}
	
	//自定义方法，用来初始化游戏面板
	public void initPanel(){
		map = DiTu.getMap(level);   //获取地图
		yuansi_map = DiTu.getMap(level); //获取地图
	}
	
	public void getHangLie(){
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if(map[i][j]==REN){    //获得人在第几行第几列
					renI = i; 
					renJ = j;
					break;
				}
			}
		}
		if (direction == UP) {     //人向上或者向下走，列不变，行改变
			qian1I = renI - 1;
			qian1J = renJ;
			qian2I = renI - 2;
			qian2J = renJ;
		} else if (direction == DOWN) {
			qian1I = renI + 1;
			qian1J = renJ;
			qian2I = renI + 2;
			qian2J = renJ;
		} else if (direction == LEFT) {//人向左或者向右走，行不变，列改变
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
	
	public void huiyibu(){   //悔一步
		if(steps.size()<=0){
			JOptionPane.showMessageDialog(GamePanel.this, "没有步骤可以悔了");
			return;   //实现跳出方法的效果
		}
		Step step = (Step)steps.pop();
		map = step.map;
		direction = step.derection;
		GamePanel.this.repaint();
	}
	
	public void move(){
		//人前面是草地或者目的地
		if(map[qian1I][qian1J]==CAO_DI || map[qian1I][qian1J]==MU_DI_DI){
			map[renI][renJ]=getYuanSiDitu(renI, renJ);  //将原来人站的位置还原本来的东西
			map[qian1I][qian1J] = REN; //将前一格变成人
			
			Step step = new Step();      //将每一个游戏步骤保存起来
			steps.push(step.copy(map, direction));
		}
		//人前面第一格是黄色箱子或者红色箱子，而且前面第二格是草地或者目的地
		else if(map[qian1I][qian1J]==XIANG_ZI || map[qian1I][qian1J]==XIANGZI_MUDIDI){
			if(map[qian2I][qian2J]==CAO_DI){  //前面第二格是草地
				map[renI][renJ]=getYuanSiDitu(renI, renJ);
				map[qian1I][qian1J] = REN; //将前一格变成人
				map[qian2I][qian2J] = XIANG_ZI; //将前面第二格变成箱子
				
				Step step = new Step();      //将每一个游戏步骤保存起来
				steps.push(step.copy(map, direction));
			}
			else if(map[qian2I][qian2J]==MU_DI_DI){ //前面第二格是目的地
				map[renI][renJ]=getYuanSiDitu(renI, renJ);
				map[qian1I][qian1J] = REN; //将前一格变成人
				map[qian2I][qian2J] = XIANGZI_MUDIDI; //将前面第二格变成箱子
				
				Step step = new Step();      //将每一个游戏步骤保存起来
				steps.push(step.copy(map, direction));
			}
		}
	}
	
	//根据行下标和列下标获取原始地图
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
	
	public void setLevel(int level){  //设置关卡
		this.level = level;
		map = DiTu.getMap(level);
		yuansi_map = DiTu.getMap(level);
		GamePanel.this.repaint();
	}
	
	public int getLevel(){  //得到当前是第几关
		return level;
	}
	
	class ML extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {  //监听鼠标点击
			GamePanel.this.requestFocus(); //当鼠标点击游戏面板时获得焦点
		}
	}
	
	class KL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {   //监听键盘按下
			int code = e.getKeyCode(); //获得按键值
			if(code==KeyEvent.VK_UP){  //如果按下的是向上的键
				direction = UP;
			}
			else if(code==KeyEvent.VK_DOWN){ //如果按下的是向下的键
				direction = DOWN;
			}
			else if(code==KeyEvent.VK_LEFT){ //如果按下的是向左的键
				direction = LEFT;
			}
			else if(code==KeyEvent.VK_RIGHT){ //如果按下的是向右的键
				direction = RIGHT;
			}
			getHangLie();   //每次改变方向时，同时改变前面一格和后面一格的行列下标
			move();  //移动
			GamePanel.this.repaint(); //人移动之后重新绘制游戏面板
			
			if(isWin()){   //过了这一关
				steps.clear();  //每进入下一关要清理上一关的步骤
				level++;
				map = DiTu.getMap(level);
				yuansi_map = DiTu.getMap(level);
				GamePanel.this.repaint();
			}
		}
	}
	
	public boolean isWin(){ //判断有没有通过关
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if(map[i][j]==XIANG_ZI){  //如果还存在黄色箱子，那么就没有过关
					return false;
				}
			}
		}
		return true;
	}
	
	//记录每一步信息的类
	class Step{
		int map[][] = new int[20][20];   //每一步的地图
		int derection; //每一步的方向
		
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
