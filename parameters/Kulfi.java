class Kulfi{
        static void flavours(String type, String name, float cost) 
		{
            System.out.println("kulfi information......");
            System.out.println("Type: " + "mango");
            System.out.println("name: " + "kulfi");
            System.out.println("cost: " + 6.2f);
            

            if (type != null)
			{
                System.out.println("kulfi type is valid");
            } 
			else 
			{
                System.err.println("kulfi  type is invalid");
				return;
            }
			if (name != null)
			{
                System.out.println("kulfi name is valid");
            } 
			else 
			{
                System.err.println("kulfi name is invalid");
				return;
            }
			if (cost!= 6)
			{
                System.out.println("kulfi cost is invalid");
            } 
			else 
			{
                System.err.println("kulfi cost invalid");
				return;
            }
			
        }
   

	public static void main(String[] args)
	{
        System.out.println("Cake information");
		
        Kulfi.flavours("mango", "kulfi",6.2f);
	}	
    
}