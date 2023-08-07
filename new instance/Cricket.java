class Cricket{
	
	String playerName="sana";
	int howManyPlayer=11;
	float score=65.1f;
	String win="india";
	String teamCaptain="virat";
	
	
	Cricket()
	{
		System.out.println("invoking the cricket with no argument");
		System.out.println("from the cricket:"+this.score);
		System.out.println("from the cricket:"+this.howManyPlayer);
		
	}
	
	Cricket(String playerName,int howManyPlayer)
	{
		System.out.println("---------------------");
		System.out.println("invoking the cricket with argument");
		this.playerName=playerName;
		this.howManyPlayer=howManyPlayer;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(" invoking main in Cricket");
		
		Cricket cricket1= new Cricket();
		Cricket cricket2= new Cricket("sana",11);
		System.out.println(cricket2.playerName); 
	    System.out.println(cricket2.howManyPlayer);	
		
		
				
		
	
	}   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




