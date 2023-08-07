class Oven{
        static void machin(String type, String ovenWrok, int exp) 
		{
            System.out.println("oven information......");
            System.out.println("Type: " + "electric");
            System.out.println("ovenWrok: " + "broiling");
            System.out.println("exp: " + 6);
            

            if (type != null)
			{
                System.out.println("oven type is valid");
            } 
			else 
			{
                System.err.println("oven typeis invalid");
				return;
            }
			if (ovenWrok != null)
			{
                System.out.println("oven ovenWrok is valid");
            } 
			else 
			{
                System.err.println("oven ovenWrok is invalid");
				return;
            }
			if (exp!= 6)
			{
                System.out.println("oven exp is invalid");
            } 
			else 
			{
                System.err.println("oven expis invalid");
				return;
            }
			
        }
   

	public static void main(String[] args)
	{
        System.out.println("Cake information");
		
        Oven.machin("electric", "broiling",6);
	}	
    
}