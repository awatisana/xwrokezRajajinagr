package com.akshata.store.app;

public class PowerBank {
public Battery battery=new Battery();
	
	public void store()
	{
		System.out.println("Invoking store() in PowerBank");
		this.battery.charging();
	}
	public void recharge()
	{
		System.out.println("Invoking recharge() in PowerBank");
		this.battery.run();
	}
}