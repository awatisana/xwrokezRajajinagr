class Train{
	static String getTrainName(int no)
	{
		System.out.println("train name info ");
	
		if(no!=0)
		{
			System.out.println("train is valid");
			if(11013==no)
			{
				
				return "express";
			}	
			if(11014==no)
			{
				
				return "express";
			}
			if(12134==no)
			{

				return "express";
			}
			if(22691==no)
			{
				
				return "express";
			}
		}
		else
		{
			System.out.println("tisis in-valid");
		}
		return "express";
		
	}
}


        
