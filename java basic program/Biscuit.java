class Biscuit{
	
	public static void main(String[] args)
	{
		System.out.println("Biscuit information");
		String parleg="Parleg";
		String marielite="Marielite";
		String goodday="Goodday";
		String krackjack="Krackjack";
		String barbon="Barbon";
		String oreo="Oreo";
		String sandwich="sandwich";
		String ginger="ginger";
		
		
		//System.out.println("parleg:"+parleg);
		//System.out.println("marielite:"+marielite);
		//System.out.println("goodday:"+goodday);
		//System.out.println("krackjack:"+krackjack);
		//System.out.println("barbon:"+barbon);
		//System.out.println("oreo:"+oreo);
		
		
		String[] biscuits={parleg, marielite, goodday,krackjack, barbon, oreo,sandwich,ginger};
		
		//String ref=biscuits[3];
		//System.out.println("element index :"+ref);
		
		for(int pos=0;pos<=7;pos++)
		{
		  System.out.println("before change :"+pos   + "is\n" +biscuits[pos]);	
		}
		biscuits[3]="magic";
		System.out.println("==============================\n");
		for(int pos=7;pos>=0;pos--)
		{
			System.out.println("after change:"+pos+"is\n"+biscuits[pos]);
		}	
	
			
		
		
		
		
	}

}