class Engine{
	static int getCCByModel(String car)
	{
		System.out.println("getCCByModel engine info ");
	
		if(car!=null)
		{
			System.out.println("engine is valid");
			if("swift"==car)
			{
				return 1198;
			}	
			if("rapid"==car)
			{
				return 1234;
			}
			if("bwm"==car)
			{
				return 1234;
			}
			if("benz"==car)
			{
				return 1345;
			}
			if("audi"==car)
			{
				return 8992;
			}
			if("bentley"==car)
			{
				
				return 1567;
			}
			
		}
		else
		{
			System.out.println("engine is in-valid");
		}
		return 15789;
		
	}
}