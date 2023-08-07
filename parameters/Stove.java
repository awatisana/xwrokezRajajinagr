class Stove{
        static void device(String useing, int lifeSpan, float cost) 
		{
            System.out.println("stove information......");
            System.out.println("useing: " + "cooking");
            System.out.println("lifeSpan: " + 15);
            System.out.println("cost: " + 200.3f);
            

            if (useing!= null)
			{
                System.out.println("stove device is valid");
            } 
			else 
			{
                System.err.println("stove device is invalid");
				return;
            }
			if (lifeSpan != 15)
			{
                System.out.println("stove lifeSpan is valid");
            } 
			else 
			{
                System.err.println("stove lifeSpanis invalid");
				return;
            }
			if (cost!= 20)
			{
                System.out.println("stove cost is invalid");
            } 
			else 
			{
                System.err.println("stove cost invalid");
				return;
            }
			
        }
   

	public static void main(String[] args)
	{
        System.out.println("stove information");
		
        Stove.device("cooking",15,200.3f);
	}	
    
}