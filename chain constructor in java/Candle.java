class Candle
{
	static String fuelUsed;
	static String wickPosition;
	char Size;
	double price;

	public void InstanceVariable()
	{
		System.out.println("Size: " + Size);
		System.out.println("price: " + price);
	}

	static void StaticVariable()
	{
		System.out.println("fuelUsed: " + fuelUsed);
		System.out.println("wickPosition: " + wickPosition);
	}

	Candle(char Size, double price)
	{
		this.Size = Size;
		this.price = price;
	}

	static
	{
		fuelUsed = "Candle Wax";
		wickPosition = "Center";
	}
}