class CarromInfo{
	
	public static void main(String[] args)
	{
		System.out.println("Invoking Oil");
		
		Carrom obj1=new Carrom();
		System.out.println(obj1.playarName);
		
		System.out.println("------");
		
		Carrom obj2=new Carrom("sana",2);
		System.out.println(obj2.playarName);
		System.out.println(obj2.totalPlayer);
		System.out.println("------");
		
		
		Carrom obj3=new Carrom(4);
		System.out.println(obj3.totalPlayer);
		System.out.println("------");
		
		
		Carrom obj4=new Carrom("pooja","small");
		System.out.println(obj4.playarName);
		System.out.println(obj4.boardSize);
		System.out.println("------");
		
		Carrom obj5=new Carrom("medium",500.0f);
		System.out.println(obj5.boardSize);
		System.out.println(obj5.cost);
		
		
		
	}

}