
public class Phone1 {
	/**
	 * 全局变量， 成员变量
	 */
	String owner; // 拥有者
	String brand; // 品牌
	String color; // 颜色
	String cpu; // CPU
	String memory; // 内存
	float price; // 价格
	String boughtDate; // 购买时间
	
	/**
	 * 成员方法
	 */
	void playMusic() {
		String music = "青藏高原"; // 局部变量
		System.out.println(owner + "的" + brand + "在播放" + music);
	}
	
	void playGame(String game) {
		System.out.println(owner + "的" + brand + "在玩" + game + "游戏");
	}
	
	void boom() {
		System.out.println(owner + "的" + brand + "爆炸了!!!");
	}
	
	public static void main(String[] args) {
		Phone1 phone = new Phone1();
		phone.owner = "小明";
		phone.brand = "Note 7";
		for (int i = 0; i < 100; i++) {
			phone.playMusic();
		}
		phone.playGame("王者荣耀");
		phone.boom();
	}

}
