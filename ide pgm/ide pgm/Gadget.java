package com.example.methodOverloading.app;

public class Gadget {
	public void run()
	{
		System.out.println("Calling method of no-arg..");
		run("Bike","Black");
	}

	public void run(String typeOfgadget)
	{
		System.out.println("Calling method of String arg..");
		System.out.println("Type : "+typeOfgadget);
		run();
	}

	public void run(String typeOfgadget,double milage)
	{
		System.out.println("Calling method of String,double arg..");
		System.out.println("Type : "+typeOfgadget);
		System.out.println("MILAGE : "+milage);
	}

	public void run(String material,String color)
	{
		System.out.println("Calling method of String,String arg..");
		System.out.println("Material : "+material);
		System.out.println("Coloe : "+color);
		run("iron",60);
	}
}