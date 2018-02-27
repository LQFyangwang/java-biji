package mainpackage;

public abstract class Drink {
	
	public static final int COFFEE = 1;
	public static final int BEER = 2;
	public static final int TEA = 3;
	
	public abstract String taste(); // �������ϵĿ�ζ
	
	public static Drink getDrink(int type) throws DrinkNotFoundException {
		switch (type) {
		case COFFEE:
			return new Coffee(); // ��switch...case...�У�ԭ������Ҫ��break����ֹ��returnҲ����
		case BEER:
			return new Beer();
		case TEA:
			return new Tea();
			default:
				throw new DrinkNotFoundException(type + "�Ҳ�����������");
		}
	}

}