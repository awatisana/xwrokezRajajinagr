package specifier;

public class BakeryRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in BakeryRunner");
		Bakery bakery = new PastryShop();
		bakery.makeCake();
		System.out.println("------child ref-------");
		PastryShop pastryShop = new PastryShop();
		pastryShop.makeCake();

	}


}
