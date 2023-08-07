class LogoInfo{
	
	public static void main(String[] args)
	{
		System.out.println("Invoking logo");
		
		Logo obj1=new Logo();
		System.out.println(obj1.companyName);
		System.out.println("------");
		
		Logo obj2=new Logo("google");
		System.out.println(obj2.companyName);
		System.out.println("------");
		
		
		Logo obj3=new Logo(600.0f,"intel");
		System.out.println(obj3.cost);
		System.out.println(obj3.companyName);
		System.out.println("------");
		
		
		Logo obj4=new Logo("identification",1000.0f);
		System.out.println(obj4.use);
		System.out.println(obj4.cost);
		System.out.println("------");
		
		Logo obj5=new Logo('Y',"clgLogo");
		System.out.println(obj5.anyLogo);
		System.out.println(obj5.types);
		System.out.println("------");
		
		
		Logo obj6=new Logo("identification","department");
		System.out.println(obj6.use);
		System.out.println(obj6.types);
		System.out.println("------");
		
		Logo obj7=new Logo(5.5f,"fecbook","clgLogo");
		System.out.println(obj7.logoSize);
		System.out.println(obj7.companyName);
		System.out.println(obj7.use);
		System.out.println("------");
		
		
		
		Logo obj8=new Logo(800.0f);
		System.out.println(obj8.cost);
		
		System.out.println("------");
		
		Logo obj9=new Logo("comapany",'Y');
		System.out.println(obj9.types);
		System.out.println(obj9.anyLogo);
		
		
		
		
		
	}

}
		
	

