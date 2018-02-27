
public class Phone {
	
	String brand; // 品牌
	String color; // 颜色
	String cpu; // cpu
	String memory; // 内存
	float price; // 价格
	String boughtDate; // 购买时间
	
	void playMusic() {
		System.out.println("手机播放音乐");
	}
	
	void boom() {
		System.out.println("boom....!!!");
	}
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		for (int i = 0; i < 100; i++) {
			phone.playMusic();
		}
		phone.boom();
	}

}
