package com.gs.common;

public class Constants {
	
	public static final int BACK = 0;
	public static final int HOUSE = 1;
	public static final int GRASS = 2;
	public static final int BOX = 3;
	public static final int DES = 4;
	public static final int DOWN = 5;
	public static final int LEFT = 6;
	public static final int RIGHT = 7;
	public static final int UP = 8;
	public static final int BOX_DES = 9;
	
	public static final int ROWS = 20;
	public static final int COLS = 20;
	
	public static final int IMAGE_WIDTH = 30;
	public static final int IMAGE_HEIGHT = 30;
	
	public static final int FRAME_WIDTH = 700;
	public static final int FRAME_HEIHGT = 700;
	
	public static final int GAME_PANEL_WIDTH = Constants.ROWS * Constants.IMAGE_WIDTH;
	public static final int GAME_PANEL_HEIGHT = Constants.COLS * Constants.IMAGE_HEIGHT;
	
	private static final String IMAGE_PATH = "src/images/";
	public static final String[] IMAGES = {
			IMAGE_PATH + "back.gif", 
			IMAGE_PATH + "house.gif", 
			IMAGE_PATH + "grass.gif", 
			IMAGE_PATH + "box.gif",
			IMAGE_PATH + "des.gif",
			IMAGE_PATH + "down.gif",
			IMAGE_PATH + "left.gif",
			IMAGE_PATH + "right.gif",
			IMAGE_PATH + "up.gif",
			IMAGE_PATH + "box_des.gif"
			};
	
	public static final String BTN_REPLAY = "replay";
	public static final String BTN_PRESTEP = "preStep";
	public static final String BTN_FIRST = "first";
	public static final String BTN_PRE = "pre";
	public static final String BTN_NEXT = "next";
	public static final String BTN_LAST = "last";
	public static final String BTN_MUSIC = "music";
	public static final String BTN_ABOUT = "about";
	
	
	
	public static final String[] CHOOSE_LEVEL = {
			"第一关", 
			"第二关", 
			"第三关", 
			"第四关", 
			"第五关", 
			"第六关", 
			"第七关", 
			"第八关", 
			"第九关", 
			"第十关", 
			"第十一关", 
			};

	public static final String[] MUSICS = {
			"eyes on me.mid",
			"guang.mid",
			"nor.mid",
			"popo.mid",
			"qin.mid"
	};
	
}
