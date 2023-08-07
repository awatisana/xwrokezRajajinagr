class StadiumKiller{
	
	public static void main(String[] args)
{
	System.out.println("Stadium Information");
	
	Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.shape);
		System.out.println(stadium.size);
		System.out.println(stadium.groundColor);
		System.out.println(stadium.usage);
		
		System.out.println("------");
		
		stadium.name="Ranna Cridangan";
		stadium.shape="Round";
		stadium.size=450000 ;
		stadium.groundColor="brown";
		stadium.usage="playing";
		
		System.out.println(stadium.name);
		System.out.println(stadium.shape);
		System.out.println(stadium.size);
		System.out.println(stadium.groundColor);
		System.out.println(stadium.usage);
		
		System.out.println("===============");
		
	Stadium stadium1=new Stadium();
		System.out.println(stadium1.name);
		System.out.println(stadium1.shape);
		System.out.println(stadium1.size);
		System.out.println(stadium1.groundColor);
		System.out.println(stadium1.usage);
		
		System.out.println("------");
		
		stadium1.name="Polo ground";
		stadium1.shape="oval";
		stadium1.size=85000;
		stadium1.groundColor="red";
		stadium1.usage="FootBall";
		
		System.out.println(stadium1.name);
		System.out.println(stadium1.shape);
		System.out.println(stadium1.size);
		System.out.println(stadium1.groundColor);
		System.out.println(stadium1.usage);
}
}
