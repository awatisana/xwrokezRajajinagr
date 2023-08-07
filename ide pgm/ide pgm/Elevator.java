package com.example.methodOverloading.app;

public class Elevator {
	public void movement()
	{
		System.out.println("calling method no-arg...");
		movement("UP_WARD");
	}

	public void movement(String upWard)
	{
		System.out.println("calling method of String arg...");
		System.out.println("Moving : "+upWard);
		movement("Down_Ward",5);
	}

	public void movement(String downWard,int floorNumber)
	{
		System.out.println("calling method of String,int arg...");
		System.out.println("Moving : "+downWard);
		System.out.println("Floor number : "+floorNumber);

	}

	public void movement(int floorNumber)
	{
		System.out.println("calling method of int arg...");
		System.out.println("Floor Number : "+floorNumber);
		movement();
	}
}
 