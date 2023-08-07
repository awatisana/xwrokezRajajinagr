class WirelessController{
	String brand;
	 String Person;
	 String uses;
     String madeIn;
	int controllingButtons;
    
	public static void main(String []args)
	{
	System.out.println(" invoking main in WirelessController");
	
	    WirelessController wirelessController= new WirelessController();
		System.out.println(wirelessController.brand); 
	    System.out.println(wirelessController.Person); 
		System.out.println(wirelessController.uses); 
	    System.out.println(wirelessController.madeIn ); 
	    System.out.println(wirelessController.controllingButtons); 
		
		
	    System.out.println(" ===================="); 
		wirelessController.brand="AmazonLuna";
     	wirelessController.Person="sana";
        wirelessController.uses = "Infrared";
		wirelessController.madeIn="US";
	    wirelessController.controllingButtons = 2;
		
		System.out.println(wirelessController.brand); 
	    System.out.println(wirelessController.Person); 
	    System.out.println(wirelessController.uses); 
	    System.out.println(wirelessController.madeIn ); 
	    System.out.println( wirelessController.controllingButtons); 
		
        WirelessController wirelessController1 = new WirelessController();
		System.out.println(wirelessController1.brand); 
	    System.out.println(wirelessController1.Person);
        System.out.println(wirelessController1.uses); 
	    System.out.println(wirelessController1.madeIn ); 
	    System.out.println(wirelessController1.controllingButtons); 
		
		wirelessController.brand="RazerWolverineV2Pro";
     	wirelessController.Person="awati";
		wirelessController1.uses = "Bluetooth";
		wirelessController1.madeIn="Austria";
	    wirelessController1.controllingButtons = 4;
		
		System.out.println(wirelessController1.brand); 
	    System.out.println(wirelessController1.Person); 
		System.out.println( wirelessController1.uses); 
	    System.out.println(wirelessController1.madeIn ); 
	    System.out.println(wirelessController1.controllingButtons); 
		
	}
}