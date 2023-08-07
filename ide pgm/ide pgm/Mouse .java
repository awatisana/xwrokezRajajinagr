package com.example.methodOverloading.app;

public class Mouse {
	public void moves()
	{
		System.out.println("Calling method of no-arg...");
		moves(90);
	}

	public void moves(String type)
	{
		System.out.println("Calling method of String. arg..");
		System.out.println("Type : "+type);
		moves("wired","Lenovo");
	}

	public void moves(String type,String name)
	{
		System.out.println("Calling method of Strin,String arg...");
		System.out.println("Type : "+type);
		System.out.println("Name : "+name);
	}

	public void moves(int number)
	{
		System.out.println("Calling method ofint arg...");
		System.out.println("Number : "+number);
		moves("Wireless");
	}
}