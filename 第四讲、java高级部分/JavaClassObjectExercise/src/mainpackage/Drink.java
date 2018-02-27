package mainpackage;

public abstract class Drink {
	
	public static final int COFFEE = 1;
	public static final int BEER = 2;
	public static final int TEA = 3;
	
	public abstract String taste(); // 返回饮料的口味
	
	public static Drink getDrink(int type) throws DrinkNotFoundException {
		switch (type) {
		case COFFEE:
			return new Coffee(); // 在switch...case...中，原本是需要用break来中止，return也可以
		case BEER:
			return new Beer();
		case TEA:
			return new Tea();
			default:
				throw new DrinkNotFoundException(type + "找不到这种饮料");
		}
	}

}