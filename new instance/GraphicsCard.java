class GraphicsCard{
	
	String cardUse="3D graphic";
	float cost=6499.0f;
	String size="6GB";
	String brand="AMD";
	
	
	GraphicsCard()
	{
		System.out.println("invoking the GraphicsCard with no argument");
		System.out.println("from the GraphicsCard:"+this.brand);
		System.out.println("from the GraphicsCard:"+this.cost);
		
	}
	
	GraphicsCard(String cardUse,String size)
	{
		System.out.println("---------------------");
		System.out.println("invoking the GraphicsCard with argument");
		this.cardUse=cardUse;
		this.size=size;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(" invoking main in GraphicsCard");
		
		GraphicsCard graphicsCard1= new GraphicsCard();
		GraphicsCard graphicsCard2= new GraphicsCard("awatiGalli","6GB");
		System.out.println(graphicsCard2.cardUse); 
	    System.out.println(graphicsCard2.size);

	} 
}