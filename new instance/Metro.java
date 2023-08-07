class Metro{
	String name;
	 int noOfPassengers;
	 String color;
     String place;
	String capacity;
	
    
	public static void main(String []args)
	{
	System.out.println(" invoking main in Metro");
	
	    Metro metro= new Metro();
		System.out.println(metro.name); 
	    System.out.println(metro.noOfPassengers); 
		System.out.println(metro.color); 
	    System.out.println(metro.place );
	    System.out.println(metro.capacity); 
		
		
	    System.out.println(" ====================");
		metro.name="PurpleLineMetro";
     	metro.noOfPassengers=200;
        metro.color = "Purple";
		metro.place="jamkhandi";
	    metro.capacity = "high";
		
		System.out.println(metro.name); 
	    System.out.println(metro.noOfPassengers); 
	    System.out.println(metro.color); 
	    System.out.println(metro.place );
	    System.out.println( metro.capacity); 
		
        Metro metro1 = new Metro();
		System.out.println(metro1.name); 
	    System.out.println(metro1.noOfPassengers); 
        System.out.println(metro1.color); 
	    System.out.println(metro1.place ); 
	    System.out.println(metro1.capacity); 
		
		metro.name="NammaMetro";
     	metro.noOfPassengers=250;
		metro1.color = "green";
		metro1.place="mudhol";
	    metro1.capacity = "medium";
		
		System.out.println(metro1.name); 
	    System.out.println(metro1.noOfPassengers); 	
		System.out.println( metro1.color); 
	    System.out.println(metro1.place ); 
	    System.out.println(metro1.capacity); 
		
	}
}