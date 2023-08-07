package com.example.methodOverloading.app;

public class Umbrella {
	public void protects() {
		System.out.println("calling method with no-arg");
		protects(5);
	}

	public void protects(String fromSun, String color) {
		System.out.println("calling method with String,String arg");
		System.out.println("Protects from : " + fromSun);
		System.out.println("Color: " + color);
		protects("Rain");
	}

	public String protects(String fromRain) {
		System.out.println("calling method with String arg");
		System.out.println("Protects from : " + fromRain);
		protects();
		return fromRain;
	}

	public int protects(int number) {
		System.out.println("calling method with int arg");
		System.out.println("Number : " + number);
		return number;
	}
}
 