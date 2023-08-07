package com.example.methodOverloading.app;

public class Stapler {
	public void steples()
	{
		System.out.println("calling no arg method....");
		steples(90);
	}

	public void steples(int noOfPages)
	{
		System.out.println("calling no arg method....");
		System.out.println("No OF Pages : "+noOfPages);
		steples("Steel");
	}

	public void steples(String material)
	{
		System.out.println("calling no arg method....");
		System.out.println("Material Used : "+material);
		steples(20,100);
	}

	public int steples(int noOfPins,int noOfPages)
	{
		System.out.println("calling no arg method....");
		System.out.println("No OF Pages : "+noOfPages);
		System.out.println("No OF PINS : "+noOfPins);
		return noOfPins;
	}
}