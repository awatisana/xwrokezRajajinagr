class Power
{
	static String powerUnit; 
	static char powerSymbol; 
	int voltage; 
	int current; 

	public void instanceVariable()
	{
		System.out.println("voltage:"+voltage);
		System.out.println("current:"+current);
	}

	static void staticVariable()
	{
		System.out.println("powerUnit:"+powerUnit);
		System.out.println("powerSymbol:"+powerSymbol);
	}

	Power(int voltage, int current)
	{
		this.voltage = voltage;
		this.current = current;
	}

	static
	{
		powerUnit = "Watt";
		powerSymbol = 'P';
	}
}
 