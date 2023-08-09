package specifier;

public class Streetrunner {
	public static void main(String[] args) {
		System.out.println("invoking main in StreetRunner");

		Street street = new Rajajinagar();
		street.addLandMark();
		System.out.println("***********Child ref************");
		Rajajinagar rajajinagar = new Rajajinagar();
		rajajinagar.addLandMark();
	}


}
