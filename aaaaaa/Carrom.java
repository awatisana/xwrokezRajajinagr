class Carrom{
	
	String playarName;
	int totalPlayer;
	String types;
	String boardSize;
	float cost;
	
	Carrom()
	{
		System.out.println("invoking with no argument");
		System.out.println(playarName);
		System.out.println("from playarName :"+this.playarName);
		
		
	}
	
	Carrom(String playarName,int totalPlayer)
	{
		System.out.println("invoking with parameters");
		System.out.println("playarName:"+playarName);
		System.out.println("totalPlayer:"+totalPlayer);
		this.playarName=playarName;
		this.totalPlayer=totalPlayer;
	}
	
	Carrom(int totalPlayer)
	{
		System.out.println("invoking with parameters");
		System.out.println("totalPlayer:"+totalPlayer);
		
		this.totalPlayer=totalPlayer;
	}
	Carrom(String playarName,String boardSize)
	{
		System.out.println("invoking with parameters");
		System.out.println("playarName:"+playarName);
		System.out.println("boardSize:"+boardSize);
		this.playarName=playarName;
		this.boardSize=boardSize;
	}
	
	Carrom(String boardSize,float cost)
	{
		System.out.println("invoking with parameters");
		System.out.println("boardSize:"+boardSize);
		System.out.println("cost:"+cost);
		this.boardSize=boardSize;
		this.cost=cost;
	}
	
	
		
}
