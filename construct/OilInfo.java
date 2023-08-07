class OilInfo{
	
	public static void main(String[] args)
	{
		System.out.println("Invoking Oil");
		Oil oil=new Oil();
		System.out.println(oil.name);
		System.out.println(oil.price);
		System.out.println(oil.vescocity);
		System.out.println("------");
		
		Oil oil1=new Oil("ruchigold",130);
		System.out.println(oil1.name);
		System.out.println(oil1.price);
		System.out.println("------");
		
		
		Oil oil2=new Oil(150,50.0f,"coco");
		System.out.println(oil2.price);
		System.out.println(oil2.vescocity);
		System.out.println(oil2.name);
		
		
		
		
		
		
		
	}
}