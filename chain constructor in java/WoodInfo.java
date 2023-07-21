class WoodInfo{
	public static void main(String[] args)
	{
		System.out.println("invoking with Wood");
		Wood obj1=new Wood();
		
		System.out.println("invoking with argument");
		Wood obj2=new Wood( "Akasa Wood",500.0f);
		
		System.out.println("invoking with argument");
		Wood obj3=new Wood("Bamboo Wood",900.0f,"good");
		
		
		
	}
}