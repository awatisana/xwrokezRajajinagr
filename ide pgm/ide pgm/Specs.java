package com.example.methodOverloading.app;

public class Specs {
	public void lens()
	{
		System.out.println("Calling NO-arguments");
		lens("Convex");
	}

	public double lens(double power)
	{
		System.out.println("Calling method with double parameter");
		System.out.println("Power : "+power);
		lens();
		return power;
	}

	public String lens(String type)
	{
		System.out.println("Calling method with String parameter");
		System.out.println("Type : "+type);
		lens(2,"Convex");
		return type;
	}

	public void lens(double power,String type)
	{
		System.out.println("Calling method with double,String parameter");
		System.out.println("Power : "+power);
		System.out.println("Type : "+type);
	}
}
