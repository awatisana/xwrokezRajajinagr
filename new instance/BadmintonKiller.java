class BadmintonKiller{
	public static void main(String []args)
	{
	System.out.println(" invoking main in BadmintonKiller");
	
	    Badminton badminton= new Badminton();
		System.out.println(badminton.userNuserNname); 
	    System.out.println(badminton.noOfPlayers); 
		System.out.println(badminton.color); 
	    System.out.println(badminton.duration ); 
	    System.out.println(badminton.brand); 
		
		
	    System.out.println(" ===================="); 
		badminton.userNname="awati";
     	badminton.noOfPlayers=2;
        badminton.color = "Black";
		badminton.duration=28;
	    badminton.brand = "YonexZR100";
		
		System.out.println(badminton.userNname); 
	    System.out.println(badminton.noOfPlayers); 
	    System.out.println(badminton.color); 
	    System.out.println(badminton.duration );
	    System.out.println( badminton.brand); 
		
        Badminton badminton1 = new Badminton();
		System.out.println(badminton1.userNname); 
	    System.out.println(badminton1.noOfPlayers);
        System.out.println(badminton1.color); 
	    System.out.println(badminton1.duration ); 
	    System.out.println(badminton1.brand); 
		
		badminton.userNname="Sana";
     	badminton.noOfPlayers=2;
		badminton1.color = "Red";
		badminton1.duration=30;
	    badminton1.brand = "Li-Ning WingLite700";
		
		System.out.println(badminton1.userNname); 
	    System.out.println(badminton1.noOfPlayers); 		
		System.out.println( badminton1.color); 
	    System.out.println(badminton1.duration ); 
	    System.out.println(badminton1.brand); 
		
	}
}