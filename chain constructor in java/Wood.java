class Wood{
	String type;
	float cost;
	String quality;
	int numberOfWood;
	String use;
	String size;
	char furnitureUse;
	
	Wood()
	{
		System.out.println("invoking with no argument");	
		
	}
	Wood(String type)
	{
		this();
		System.out.println("invoking with argument");
	    this.type=type;
		
	}
	Wood(String type,float cost)
	{
		this(type);
		System.out.println("invoking with argument");
		this.cost=cost;
		}
		
	Wood(String type,float cost,String quality)
	{
		this(type,cost);
		System.out.println("invoking with  argument");
		this.quality=quality;
	
	   
	}
	Wood(String type,float cost,String quality,int numberOfWood)
	{
		this(type,cost,quality);
		System.out.println("invoking with argument");
		this.numberOfWood=numberOfWood;
		
	}
}