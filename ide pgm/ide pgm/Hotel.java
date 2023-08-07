package com.example.methodOverloading.app;

public class Hotel {
	public void management() {
		System.out.println("invoking management mthod with no arguments......");
		management("Bangalore");
	}

	public void management(int noOfChefs) {
		System.out.println("invoking management mthod with int parameter......");
		System.out.println("NO of Chefs : " + noOfChefs);
	}

	public void management(int noOfWorkers, String name) {
		System.out.println("invoking management mthod with int,String parameter......");
		System.out.println("NO of Chefs : " + noOfWorkers);
		System.out.println("Name : " + name);
		management(40);
	}

	public void management(String location) {
		System.out.println("invoking management mthod with String parameter......");
		System.out.println("Location : " + location);
		management(90, "Rameshwara Cafe");
	}

}
 