class Park{
	
	String name;
	String type;
	float area;
	String place;
	String openingDate;
	int noOfGames;
	String components;
	String inventer;
	int noOfBenches;
	
	Park()
	{
		System.out.println("invoking with no parameters");
	}
	
	Park(String name)
	{
		super();
		System.out.println("invoking String as parameters");
		this.name=name;
	}
	
	Park(String name,String type)
	{
		this(name);
		System.out.println("invoking String as parameters");
		this.type=type;
	}
	
	Park(String name,String type,float area)
	{
		this(name,type);
		System.out.println("invoking float & String parameters");
		this.area=area;
	}
	
	Park(String name,String type,float area,String place)
	{
		this(name,type,area);
		System.out.println("invoking double,String,float parameters");
		this.place=place;
	}
	
	Park(String name,String type,float area,String place,String openingDate)
	{
		this(name,type,area,place);
		System.out.println("invoking String,float parameters");
		this.openingDate=openingDate;
	}
	
	Park(String name,String type,float area,String place,String openingDate,int noOfGames)
	{
		this(name,type,area,place,openingDate);
		System.out.println("invoking float,String,int parameters");
		this.noOfGames=noOfGames;
	}
	
	Park(String name,String type,float area,String place,String openingDate,int noOfGames,String components)
	{
		this(name,type,area,place,openingDate,noOfGames);
		System.out.println("invoking String,int parameters");
		this.components=components;
	}
	
	Park(String name,String type,float area,String place,String openingDate,int noOfGames,String components,String inventer)
	{
		this(name,type,area,place,openingDate,noOfGames,components);
		System.out.println("invoking float,String,int parameters");
		this.inventer=inventer;
	}
	
	
	Park(String name,String type,float area,String place,String openingDate,int noOfGames,String components,String inventer,int noOfBenches)
	{
		this(name,type,area,place,openingDate,noOfGames,components,inventer);
		System.out.println("invoking float,String,int parameters");
		this.noOfBenches=noOfBenches;
	}
}
	
	