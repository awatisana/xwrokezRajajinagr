class Oil{
	
	String name;
	int price;
	float vescocity;
	
	Oil()
	{
		System.out.println("invoking with no argument");
		System.out.println(name);
		System.out.println("from name :"+this.name);
		
		
	}
	
	Oil(String name,int price)
	{
		System.out.println("invoking with parameters");
		System.out.println("name :"+name);
		System.out.println("price :"+price);
		this.name=name;
		this.price=price;
	}
	
	Oil(int price,float vescocity,String name)
	{
		System.out.println("invoking with parameters");
		System.out.println("price :"+price);
		System.out.println("vescocity :"+vescocity);
		System.out.println("name :"+name);
		
		this.price=price;
		this.vescocity=vescocity;
		this.name=name;
	}
		
}