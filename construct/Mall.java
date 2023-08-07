class Mall{
	
	String name;
	String type;
	String place;
	int sizeInMeterSquare;
	String components;
	String design;
	int openingDate;
	
	Mall()
	{
		System.out.println("invoking with no parameters");
	}
	
	Mall(String name)
	{
		super();
		System.out.println("invoking String as parameters");
		this.name=name;
	}
	
	Mall(String name,String type)
	{
		this(name);
		System.out.println("invoking String & double as parameters");
		this.type=type;
	}
	
	Mall(String name,String type,String place)
	{
		this(name,type);
		System.out.println("invoking double & String parameters");
		this.place=place;
	}
	
	Mall(String name,String type,String place,int sizeInMeterSquare)
	{
		this(name,type,place);
		System.out.println("invoking double,String,int parameters");
		this.sizeInMeterSquare=sizeInMeterSquare;
	}
	
	Mall(String name,String type,String place,int sizeInMeterSquare,String components)
	{
		this(name,type,place,sizeInMeterSquare);
		System.out.println("invoking double,String,int parameters");
		this.components=components;
	}
	
	Mall(String name,String type,String place,int sizeInMeterSquare,String components,String design)
	{
		this(name,type,place,sizeInMeterSquare,components);
		System.out.println("invoking double,String,int parameters");
		this.design=design;
	}
	
	Mall(String name,String type,String place,int sizeInMeterSquare,String components,String design,int openingDate)
	{
		this(name,type,place,sizeInMeterSquare,components,design);
		System.out.println("invoking double,String,int parameters");
		this.openingDate=openingDate;
	}
}
	
	
	