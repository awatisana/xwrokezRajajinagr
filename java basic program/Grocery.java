class Grocery{
	
	public static void main (String[] args)
	{
		System.out.println("Grocery item list");
		String pasta="Pasta";
		String vegetable="Vegetable";
		String egg="Eagg";
		String fruit="Fruit";
		String milk="Milk";
		String bread="Bread";
		String rice="Rice";
		String potato="potato";
		
				String[] grocerys={pasta,vegetable,egg,fruit,milk,bread,rice,potato};
		
		
		for(int item=0;item<=7;item++)
		{
		  System.out.println("before change :"+item   + "is\n" +grocerys[item]);	
		}
	
		System.out.println("==============================\n");
		grocerys[4]="tomato";
		
		for(int item=7;item>=0;item--)
		{
			System.out.println("after change:"+item  + "is\n" +grocerys[item]);

		
			
		}
	}
}

		