class Baker{
        static void cooking(int fooditem, int noOfPeople,String workingFor,int exp,int duration,String assitance) 
		{
            System.out.println("baker cooking tasty......");
            System.out.println("fooditem: " + 7);
            System.out.println("noOfPeople: " + 3);
            System.out.println("workingFor: " + "bakery");
            System.out.println("exp: " + 1);
            System.out.println("duration: " + 4);
			System.out.println("assitance:"+"saniya");

            if (fooditem!= 7)
			{
                System.out.println("fooditem is valid");
            } 
			else 
			{
                System.err.println("fooditem is invalid");
				return;
            }
			if (noOfPeople != 3)
			{
                System.out.println("noOfPeople valid");
            } 
			else 
			{
                System.err.println("noOfPeople invalid");
				return;
            }
			if (workingFor != null)
			{
                System.out.println("workingFor is invalid");
            } 
			else 
			{
                System.err.println(" workingFor is invalid");
				return;
            }
			if (exp!= 1)
			{
                System.out.println("exp  is valid");
            } 
			else 
			{
                System.err.println("exp invalid");
				return;
            }
			if (duration!= 10)
			{
                System.out.println("duration is valid");
            } 
			else 
			{
                System.err.println("duration is invalid");
				return;
            }
			if (assitance!= null)
			{
                System.out.println("assitance is valid");
            } 
			else 
			{
                System.err.println("assitance is invalid");
				return;
            }
        }
   

	public static void main(String[] args)
	{
        System.out.println("baker information");
		
        Baker.cooking(7,3, "bakery",1, 4,"saniya");
	}	
    
}




