class Jacket{
	String color;
	int size;
	String brand;
	float price;
	String comapay;




public static void main(String []args)
	{
	 System.out.println(" invoking main in jacket");
	
	   Jacket jacket = new Jacket();
	  	System.out.println(jacket.color); 
	    System.out.println(jacket.size ); 
	    System.out.println(jacket.brand); 
		System.out.println(jacket.price); 
		System.out.println(jacket.comapay); 
		
		
		
	    System.out.println(" ===================="); 
		
		jacket.color = "pink";
		jacket.size=36;
	    jacket.brand = "peter";
		jacket.price = 65.9f;
		jacket.brand = "lolo";
		
	    System.out.println(jacket.color); 
	    System.out.println(jacket.size ); 
	    System.out.println( jacket.brand); 
	    System.out.println( jacket.price);  
		System.out.println( jacket.comapay); 
		


	   Jacket jacket1 = new Jacket();
        System.out.println(jacket1.color); 
	    System.out.println(jacket1.size ); 
	    System.out.println(jacket1.brand); 
		System.out.println(jacket1.price); 
		System.out.println(jacket1.comapay); 
		
		jacket1.color = "black";
		jacket1.size=34;
	    jacket1.brand = "zudio";
		jacket1.price=88.6f;
	    jacket1.comapay = "zudio";
		
		System.out.println( jacket1.color); 
	    System.out.println(jacket1.size );
	    System.out.println(jacket1.brand); 
		System.out.println(jacket1.price );
	    System.out.println(jacket1.comapay); 
		
	
		
	}
}