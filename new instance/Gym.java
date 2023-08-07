class Gym{
	String name;
	 int noOfPerson;
	 String guide;
     String place;
	int noOfEquipments;
    
	public static void main(String []args)
	{
	System.out.println(" invoking main in gym");
	
	    Gym gym= new Gym();
		System.out.println(gym.name); //null
	    System.out.println(gym.noOfPerson); //null
		System.out.println(gym.guide); //null
	    System.out.println(gym.place ); //0
	    System.out.println(gym.noOfEquipments); //null
		
		
	    System.out.println(" ===================="); //null
		gym.name="DA Fitness studio";
     	gym.noOfPerson=50;
        gym.guide = "Saad";
		gym.place="Hubli";
	    gym.noOfEquipments = 20;
		
		System.out.println(gym.name); //null
	    System.out.println(gym.noOfPerson); //0
	    System.out.println(gym.guide); //null
	    System.out.println(gym.place ); //0
	    System.out.println( gym.noOfEquipments); //null
		
        Gym gym1 = new Gym();
		System.out.println(gym1.name); //null
	    System.out.println(gym1.noOfPerson); //0
        System.out.println(gym1.guide); //null
	    System.out.println(gym1.place ); //0
	    System.out.println(gym1.noOfEquipments); //null
		
		gym.name="BodyProFitess";
     	gym.noOfPerson=60;
		gym1.guide = "Sana";
		gym1.place="Banglore";
	    gym1.noOfEquipments = 20;
		
		System.out.println(gym1.name); //null
	    System.out.println(gym1.noOfPerson); //0		
		System.out.println( gym1.guide); //null
	    System.out.println(gym1.place ); //0
	    System.out.println(gym1.noOfEquipments); //null
		
	}
}