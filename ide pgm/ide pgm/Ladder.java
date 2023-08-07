package com.example.methodOverloading.app;

public class Ladder {
	public void ladderTypes()
	{
		System.out.println("CAlling no-arg method...");
		ladderTypes("Climb");
	}

	public void ladderTypes(String purpose)
	{
		System.out.println("CAlling String type  method...");
		System.out.println("Purpose : "+purpose);
		ladderTypes("single ladder",15);
	}

	public void ladderTypes(String type,int noOfSteps)
	{
		System.out.println("CAlling String,String type method...");
		System.out.println("Type : "+type);
		System.out.println("NO OF Steps : "+noOfSteps);
		ladderTypes(20);
	}

	public void ladderTypes(int noOfSteps)
	{
		System.out.println("CAlling int  method...");
		System.out.println("NO of Steps : "+noOfSteps);

	}
}