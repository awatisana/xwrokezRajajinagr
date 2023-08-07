class GoldSmith{
        static void gold(String type, String nameGoldSmith,int exp) 
		{
            System.out.println("GoldSmith information......");
            System.out.println("Type: " + "gold worker");
            System.out.println("nameGoldSmith: " + "forging");
            System.out.println("exp: " + 9);
            

            if (type != null)
			{
                System.out.println("goldsmith type is valid");
            } 
			else 
			{
                System.err.println("goldsmith type is invalid");
				return;
            }
			if (nameGoldSmith != null)
			{
                System.out.println("goldsmith name is valid");
            } 
			else 
			{
                System.err.println("goldsmith name is invalid");
				return;
            }
			if (exp!= 9)
			{
                System.out.println("goldsmith exp is invalid");
            } 
			else 
			{
                System.err.println("goldsmith expinvalid");
				return;
            }
			
        }
   

	public static void main(String[] args)
	{
        System.out.println("Cake information");
		
        Kulfi.flavours("mango", "kulfi",6.2f);
	}	
    
}