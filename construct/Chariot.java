class Chariot{
	
	String wheeledName;
	int price;
	String type;
	String indiaChariots;
	float feet;
	char avalibleInIndia;
	
	Chariot()
	{
		System.out.println("invoking with no argument");
		System.out.println(wheeledName);
		System.out.println("from wheeledname :"+this.wheeledName);
		
		
	}
	
	Chariot(String wheeledName,int price)
	{
		System.out.println("invoking with parameters");
		System.out.println("wheeledName:"+wheeledName);
		System.out.println("price :"+price);
		this.wheeledName=wheeledName;
		this.price=price;
	}
	
	Chariot(int price,float feet,String wheeledName)
	{
		System.out.println("invoking with parameters");
		System.out.println("price :"+price);
		System.out.println("feet :"+feet);
		System.out.println("wheeledName :"+wheeledName);
		
		this.price=price;
		this.feet=feet;
		this.wheeledName=wheeledName;
	}
		
	Chariot(String type,String wheeledName)
	{
		System.out.println("invoking with parameters");
		System.out.println("type :"+type);
		System.out.println("wheeledName :"+wheeledName);
		
		this.type=type;
		this.wheeledName=wheeledName;
	}
		
		
	Chariot(int price,float feet)
	{
		System.out.println("invoking with parameters");
		System.out.println("price :"+price);
	    System.out.println("feet :"+feet);
		
		this.price=price;
		this.feet=feet;
	}
		
	Chariot(String wheeledName)
	{
		System.out.println("invoking with parameters");
		System.out.println("wheeledName:"+wheeledName);
		
		this.wheeledName=wheeledName;
	}
		
	Chariot(float feet)
	{
		System.out.println("invoking with parameters");
		System.out.println("feet:"+feet);
		
		
		this.feet=feet;
	}
		
	Chariot(String wheeledName,float feet)
	{
		System.out.println("invoking with parameters");
		System.out.println("wheeledName :"+wheeledName);
		System.out.println("feet:"+feet);
		
		
		this.wheeledName=wheeledName;
		this.feet=feet;
	}
		
	Chariot(float feet,String wheeledName,String type)
	{
		System.out.println("invoking with parameters");
		System.out.println("feet:"+feet);
		System.out.println("wheeledName:"+wheeledName);
		System.out.println("type:"+type);
	
		
		this.feet=feet;
		this.wheeledName=wheeledName;
		this.type=type;
	}
	
	Chariot(String type,char avalibleInIndia)
	{
		
		System.out.println("type :"+type);
		System.out.println("avalibleInIndia:"+avalibleInIndia);
		
		this.type=type;
		this.avalibleInIndia=avalibleInIndia;
	}
		
	Chariot( float feet,String indiaChariots )
	{
		System.out.println("invoking with parameters");
		
		System.out.println("feet:"+feet);
		System.out.println("indiaChariots:"+indiaChariots);
		
		
		this.feet=feet;
		
		this.indiaChariots=indiaChariots;
		
		
	}
		
}