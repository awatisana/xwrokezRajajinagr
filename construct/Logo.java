class Logo{
	
	String companyName;
	String types;
	float logoSize;
	String use;
	float cost;
	char anyLogo;
	
	Logo()
	{
		System.out.println("invoking with no argument");
		System.out.println(companyName);
		System.out.println("from companyName:"+this.companyName);
		
		
	}
	
	Logo(String companyName)
	{
		System.out.println("invoking with parameters");
		System.out.println("companyName:"+companyName);
		
		this.companyName=companyName;
		
	}
	
	Logo(float cost,String companyName)
	{
		System.out.println("invoking with parameters");
		System.out.println("cost:"+cost);
		System.out.println("companyName:"+companyName);

		this.cost=cost;
		this.companyName=companyName;
	}
	Logo(String use,float cost)
	{
		System.out.println("invoking with parameters");
		System.out.println("use:"+use);
		System.out.println("cost:"+cost);
		
		
		this.use=use;
		this.cost=cost;
		
	}
	
	Logo(char anyLogo ,String types)
	{
		System.out.println("invoking with parameters");
		System.out.println("anyLogo:"+anyLogo);
		System.out.println("types:"+types);
		this.anyLogo=anyLogo;
		this.types=types;
	}
	
	
	Logo(String use,String types)
	{
		System.out.println("invoking with parameters");
		System.out.println("use:"+use);
		System.out.println("types:"+types);
		
		this.use=use;
		this.types=types;
		
	}
	
    Logo(float logoSize,String companyName,String use)
	{
		System.out.println("invoking with parameters");
		System.out.println("logoSize:"+logoSize);
		System.out.println("companyName:"+companyName);
		System.out.println("use:"+use);
		this.logoSize=logoSize;
		this.companyName=companyName;
		this.use=use;
	}
	
	Logo(float cost)
	{
		System.out.println("invoking with parameters");
		System.out.println("cost:"+cost);
		
		this.cost=cost;
		
	}
	
	Logo(String types,char anyLogo)
	{
		System.out.println("invoking with parameters");
		System.out.println("types:"+types);
		System.out.println("anyLogo:"+anyLogo);
		
		
		this.types=types;
		this.anyLogo=anyLogo;
		
	}
	
	
}
