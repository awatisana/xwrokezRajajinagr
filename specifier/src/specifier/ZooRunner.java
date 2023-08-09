package specifier;

public class ZooRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");

		Zoo zoo = new SafariZoo();
		zoo.buyTicket();
		System.out.println("**********Child ref");
		SafariZoo safariZoo = new SafariZoo();
		safariZoo.buyTicket();

	}
}
