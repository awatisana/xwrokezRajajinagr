class PowerBank{
	
	String name;
	String brand;
	String application;
	String warranty;
	int battery;


public static void main(String[] args)
{
	System.out.println("PowerBank Information");
	
	PowerBank powerbank=new PowerBank();
		System.out.println(powerbank.name);
		System.out.println(powerbank.brand);
		System.out.println(powerbank.application);
		System.out.println(powerbank.warranty);
		System.out.println(powerbank.battery);
		
		System.out.println("------");
		
		powerbank.name="wired";
		powerbank.brand="boat";
		powerbank.application="Portable";
		powerbank.warranty="1 yr";
		powerbank.battery=20000;
		
		System.out.println(powerbank.name);
		System.out.println(powerbank.brand);
		System.out.println(powerbank.application);
		System.out.println(powerbank.warranty);
		System.out.println(powerbank.battery);
		
		System.out.println("===============");
		
		PowerBank powerbank1=new PowerBank();
		System.out.println(powerbank1.name);
		System.out.println(powerbank1.brand);
		System.out.println(powerbank1.application);
		System.out.println(powerbank1.warranty);
		System.out.println(powerbank1.battery);
		
		System.out.println("------");
		
		powerbank1.name="wireless";
		powerbank1.brand="Intex";
		powerbank1.application="Portable";
		powerbank1.warranty="1 yr";
		powerbank1.battery=40000;
		
		System.out.println(powerbank1.name);
		System.out.println(powerbank1.brand);
		System.out.println(powerbank1.application);
		System.out.println(powerbank1.warranty);
		System.out.println(powerbank1.battery);
}
}
		
		
		