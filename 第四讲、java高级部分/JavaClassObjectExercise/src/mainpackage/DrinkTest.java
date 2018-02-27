package mainpackage;

public class DrinkTest {
	
	public static void main(String[] args) {
		try {
			Drink drink = Drink.getDrink(Drink.COFFEE);
			System.out.println(drink.taste());
		} catch (DrinkNotFoundException e) {
			System.out.println("没有这种饮料，要不换一个？");
		} finally {
			
		}
		try {
			Drink drink1 = Drink.getDrink(Drink.TEA);
			System.out.println(drink1.taste());
		} catch (DrinkNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("要不换一杯咖啡");
		}
		try {
			Drink drink2 = Drink.getDrink(5);
		} catch (DrinkNotFoundException e) {
			// e.printStackTrace();
			System.out.println("不卖！");
		}
	}

}
