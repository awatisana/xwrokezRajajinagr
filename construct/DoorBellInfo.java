class DoorBellInfo{
	
	public static void main(String[] args)
	{
		System.out.println("Invoking Oil");
		
		DoorBell obj1=new DoorBell();
		System.out.println(obj1.inventedName);
		System.out.println("------");
		
		DoorBell obj2=new DoorBell("josephHenry");
		System.out.println(obj2.inventedName);
		System.out.println("------");
		
		
		DoorBell obj3=new DoorBell(600.0f,"josephHenry");
		System.out.println(obj3.cost);
		System.out.println(obj3.inventedName);
		System.out.println("------");
		
		
		DoorBell obj4=new DoorBell("home",1000.0f,'N');
		System.out.println(obj4.use);
		System.out.println(obj4.cost);
		System.out.println(obj4.wireLess);
		System.out.println("------");
		
		DoorBell obj5=new DoorBell('N',500.0f);
		System.out.println(obj5.wireLess);
		System.out.println(obj5.cost);
		System.out.println("------")
		
		DoorBell obj6=new DoorBell('Y',"highSounda");
		System.out.println(obj6.wireLess);
		System.out.println(obj6.ring);
		System.out.println("------");
		
		DoorBell obj7=new DoorBell('Y');
		System.out.println(obj7.wireLess);
		
		
		
	}

}