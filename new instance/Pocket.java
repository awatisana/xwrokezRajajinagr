class Pocket{
	
	String type;
	String size;
	int pocketZip;
	float pocketPrice;
	String color;
    public static void main(String []args)
    {
	System.out.println(" invoking main in pocket");
	
	    Pocket pocket = new Pocket();
	  	System.out.println(Pocket.type);  
	    System.out.println(Pocket.size );  
	    System.out.println(Pocket.pocketZip);  
		System.out.println(Pocket.pocketPrice);  
		System.out.println(Pocket.color); 
		
		
		
	    System.out.println(" ===================="); 
		
		String type="twoFront";
	    String size="small";
	    int pocketZip=2;
	    float pocketPrice=80.0f;
	    String color="pink";
		
	    System.out.println(Pocket.type); 
	    System.out.println(Pocket.size ); 
	    System.out.println(Pocket.pocketZip); 
	    System.out.println(Pocket.pocketPrice);  
		System.out.println(Pocket.color); 
		


	    Pocket pocke1t = new Pocket();
        System.out.println(Pocket1.type); 
	    System.out.println(Pocket1.size ); 
	    System.out.println(Pocket1.pocketZip); 
	    System.out.println(Pocket1.pocketPrice);  
		System.out.println(Pocket1.color); 
		
		
		Pocket1.type = "one pocket";
		Pocket1.size=34;
	    Pocket1.pocketZip = "zudio";
		Pocket1.pocketPrice=88.6f;
	    Pocket1.color = "pink";
		
		System.out.println(Pocket1.type);  
	    System.out.println(Pocket1.size ); 
	    System.out.println(Pocket1.pocketZip); 
		System.out.println(Pocket1.pocketPrice);  
	    System.out.println(Pocket1.color); 
	}
	


	
}
}