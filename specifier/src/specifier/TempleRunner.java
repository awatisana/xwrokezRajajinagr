package specifier;

public class TempleRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in TempleRunner");

		Temple temple = new ShivaTemple();
		temple.hope();
		System.out.println("************Child ref*************");
		ShivaTemple shivaTemple = new ShivaTemple();
		shivaTemple.hope();

	}


}
