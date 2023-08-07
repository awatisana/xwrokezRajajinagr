package com.example.methodOverloading.app;

public class IronBox {
	public void smoothsCloth()
	{
		System.out.println("Callling method with No-arguments...... ");
		smoothsCloth(20);
	}

	public String smoothsCloth(String fabric)
	{
		System.out.println("Callling method with String parameter...... ");
		System.out.println("FAbric : "+fabric);
		return fabric;
	}

	public int smoothsCloth(int noOfCloths)
	{
		System.out.println("Callling method with int parameter...... ");
		System.out.println("No of Cloths : "+noOfCloths);
		smoothsCloth(45.5);
		return noOfCloths;
	}

	public double smoothsCloth(double tempertature)
	{
		System.out.println("Callling method with double arguments...... ");
		System.out.println("Temperature : "+tempertature);
		smoothsCloth("Cotton");
		return tempertature;
	}
}