
public class Phone {
	
	String brand; // Ʒ��
	String color; // ��ɫ
	String cpu; // cpu
	String memory; // �ڴ�
	float price; // �۸�
	String boughtDate; // ����ʱ��
	
	void playMusic() {
		System.out.println("�ֻ���������");
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
