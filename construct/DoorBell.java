class DoorBell{
	
	String inventedName;
	char wireLess;
	String use;
	String ring;
	float cost;
	
	DoorBell()
	{
		System.out.println("invoking with no argument");
		System.out.println(inventedName);
		System.out.println("from inventedName :"+this.inventedName);
		
		
	}
	
	DoorBell(String inventedName)
	{
		System.out.println("invoking with parameters");
		System.out.println("inventedName:"+inventedName);
		
		this.inventedName=inventedName;
		
	}
	
	DoorBell(float cost,String inventedName)
	{
		System.out.println("invoking with parameters");
		System.out.println("cost:"+cost);
		System.out.println("inventedName:"+inventedName);

		this.cost=cost;
		this.inventedName=inventedName;
	}
	DoorBell(String use,float cost,char wireLess)
	{
		System.out.println("invoking with parameters");
		System.out.println("use:"+use);
		System.out.println("cost:"+cost);
		System.out.println("wireLess:"+wireLess);
		
		this.use=use;
		this.cost=cost;
		this.wireLess=wireLess;
	}
	
	DoorBell(char wireLess,float cost)
	{
		System.out.println("invoking with parameters");
		System.out.println("wireLess:"+wireLess);
		System.out.println("cost:"+cost);
		this.wireLess=wireLess;
		this.cost=cost;
	}
	
	DoorBell(char wireLess,String ring)
	{
		System.out.println("invoking with parameters");
		System.out.println("wireLess:"+wireLess);
		System.out.println("ring:"+ring);
		this.wireLess=wireLess;
		this.ring=ring;
	}
	
	DoorBell(char wireLess)
	{
		System.out.println("invoking with parameters");
		System.out.println("wireLess:"+wireLess);
		
		this.wireLess=wireLess;
		
	}
		
}
