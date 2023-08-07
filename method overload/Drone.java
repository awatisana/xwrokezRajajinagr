class Drone{
	static double getDistanceByFlight( String operator,String event)
	{
		double duration=0;
		if(operator!=null)
		{
			System.out.println("operator is valid");
			if(operator=="sahil")
			{
				System.out.println("operator is"+operator);
				return 20;
		
			}
			if(operator=="abid")
			{
				System.out.println("operator is"+operator);
				return 10;
			}
			
		}
		
		if(event!=null)
		{
			System.out.println("event is valid");
			if(event=="search")
			{
				System.out.println("event is"+event);
				return 10;
		
			}
			if(event=="viewContent")
			{
				System.out.println("event is"+event);
				return 30;
			}
			return 200;
			
		}
		else
		{
			System.err.println("event is invalid");
		}
		return -1;
     	
	}	






static double getPriceByEvent( String eventName)
	{
		double duration=0;
		if(eventName!=null)
		{
			System.out.println("eventNameis valid");
			if(eventName=="college event")
			{
				System.out.println("eventName is"+eventName);
				return 20;
		
			}
			if(eventName=="networking event")
			{
				System.out.println("eventNameis"+eventName);
				return 10;
			}
			return 100;
		}
            else
			{
			System.err.println("eventName is invalid");
		    return -1;
			}
	}	

	
	
	
	
	static int getDiscountByEvent( String eventName,String refPerson)
	{
		
		if(eventName!=null)
		{
			System.out.println("eventNameis valid");
			if(eventName=="college event")
			{
				System.out.println("eventName is"+eventName);
				return 20;
		
			}
			if(eventName=="networking event")
			{
				System.out.println("eventNameis"+eventName);
				return 10;
			}
			return 100;
		}
           			
		
		if(refPerson!=null)
		{
			System.out.println("refPerson is valid");
			if(refPerson=="sana")
			{
				System.out.println("refPerson is"+refPerson);
				return 10;
		
			}
			if(refPerson=="awati")
			{
				System.out.println("event is"+refPerson);
				return 30;
			}
			return 200;
			
		}
		else
		{
			System.err.println("refPerson is invalid");
		}
		return -1;
     	
	}	
}



