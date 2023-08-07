package com.akshata.store.app;

public class Shop {
	public SalesMan salesman=new SalesMan();
	public void promotProduct()
	{
		System.out.println("Invoking promotProduct() in Shop");
		this.salesman.sale();
				
	}
	public void onlinePayment()
	{
		System.out.println("Invoking onlinePayment()in Shop");
		this.salesman.handleCustomer();
				
	}
}