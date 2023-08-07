class Fabric{
	static double getPrice(String fabric)
	{
		System.out.println("getPrice fabric info ");
	
		if(fabric!=null)
		{
			System.out.println("engine is valid");
			if("cotton"==fabric)
			{
				
				return 12;
			}	
			if("nylon"==fabric)
			{
				
				return 567;
			}
			if("woolen"==fabric)
			{
				
				return 94;
			}
			if("linen"==fabric)
			{
				
				return 42;
			}
			if("polyster"==fabric)
			{
				
				return 67;
			}
			if("silk"==fabric)
			{
				
				return 12;
			}
			
		}
		else
		{
			System.out.println("fabric is in-valid");
		}
		return 88;
		
	}
}


        
