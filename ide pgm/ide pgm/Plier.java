package com.example.methodOverloading.app;

public class Plier {
	public void cuts()
	{
		System.out.println("Calling method of no-arg....");
		cuts("IRON");
	}

	public void cuts(String material)
	{
		System.out.println("Calling method of Stringa arg....");
		System.out.println("Material : "+material);
		cuts(20);
	}

	public void cuts(int quantity)
	{
		System.out.println("Calling method of int arg....");
		System.out.println("Quantity : "+quantity);
		cuts("Steel",3);
	}

	public void cuts(String matereial,int quantity)
	{
		System.out.println("Calling method of String,int....");
		System.out.println("Material : "+matereial);
		System.out.println("Quantity : "+quantity);
	}
}