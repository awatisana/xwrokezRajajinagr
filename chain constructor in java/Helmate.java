 class Helmate{
	double price;
	char  helmateSize;
	static String brand;
	static String manufacturingState;


	public void InstanceVariable()
	{
		System.out.println("Price:"+price);
		System.out.println("helmateSize:"+helmateSize);
	}


	static void staticVariable()
	{
		System.out.println("Brand:"+brand);
		System.out.println("manufacturingState:"+manufacturingState);

	}

	Helmate(double price,char helmateSize)
	{
		this.price = price;
		this.helmateSize = helmateSize;
	}


	static
	{
		brand = "Vega";
		manufacturingState = "Karnataka";
	}
}
 