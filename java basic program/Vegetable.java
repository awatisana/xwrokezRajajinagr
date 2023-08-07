class Vegetable{
	public static void main(String[] args)
	{
		System.out.println("price of vegetables ");
		
		
		
		int[] vegetables={10,25,35,50,40,66,15,30};
		
		
		for(int price=0;price<=7;price++)
		{
		  System.out.println("price of vegetables before change:"+price  + "is\n" +vegetables[price]);	
		}
	
		System.out.println("==============================\n");
		vegetables[4]=90;
		for(int price=7;price>=0;price--)
		{
			System.out.println("price of vegetables after change:"+price + "is\n" +vegetables[price]);
		}

		
	}
}