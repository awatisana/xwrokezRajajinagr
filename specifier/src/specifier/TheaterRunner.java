package specifier;

public class TheaterRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner");

		Theater theater = new NavarangTheater();
		theater.display();
		System.out.println("*********Child ref**********");
		NavarangTheater navarangTheater = new NavarangTheater();
		navarangTheater.display();

	}


}
