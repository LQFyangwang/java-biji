
public class Phone1 {
	/**
	 * ȫ�ֱ����� ��Ա����
	 */
	String owner; // ӵ����
	String brand; // Ʒ��
	String color; // ��ɫ
	String cpu; // CPU
	String memory; // �ڴ�
	float price; // �۸�
	String boughtDate; // ����ʱ��
	
	/**
	 * ��Ա����
	 */
	void playMusic() {
		String music = "��ظ�ԭ"; // �ֲ�����
		System.out.println(owner + "��" + brand + "�ڲ���" + music);
	}
	
	void playGame(String game) {
		System.out.println(owner + "��" + brand + "����" + game + "��Ϸ");
	}
	
	void boom() {
		System.out.println(owner + "��" + brand + "��ը��!!!");
	}
	
	public static void main(String[] args) {
		Phone1 phone = new Phone1();
		phone.owner = "С��";
		phone.brand = "Note 7";
		for (int i = 0; i < 100; i++) {
			phone.playMusic();
		}
		phone.playGame("������ҫ");
		phone.boom();
	}

}
