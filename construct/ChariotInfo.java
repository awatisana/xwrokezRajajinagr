class ChariotInfo{
	
	public static void main(String[] args)
	{
		System.out.println("Invoking chariot");
		
		Chariot obj1=new Chariot();
		System.out.println(obj1.wheeledName);
		System.out.println("------");
		
		Chariot obj2=new Chariot("taladhwaja",1000);
		System.out.println(obj2.wheeledName);
		System.out.println(obj2.price);
		System.out.println("------");
		
		
		Chariot obj3=new Chariot(600,562.0f,"rath");
		System.out.println(obj3.price);
		System.out.println(obj3.feet);
		System.out.println(obj3.wheeledName);
		System.out.println("------");
		
		
		Chariot obj4=new Chariot("4wheeld","rath");
		System.out.println(obj4.type);
		System.out.println(obj4.wheeledName);
		System.out.println("------");
		
		Chariot obj5=new Chariot(572,892.0f);
		System.out.println(obj5.price);
		System.out.println(obj5.feet);
		System.out.println("------");
		
		
		Chariot obj6=new Chariot("balabhadra");
		System.out.println(obj6.wheeledName);
		
		System.out.println("------");
		
		Chariot obj7=new Chariot(5.5f);
		System.out.println(obj7.feet);
		
		System.out.println("------");
		
		
		
		Chariot obj8=new Chariot("jagannath",987.0f);
		System.out.println(obj8.wheeledName);
		System.out.println(obj8.feet);
		
		System.out.println("------");
		
		Chariot obj9=new Chariot(892.0f,"rama","4wheeld");
		System.out.println(obj9.feet);
		System.out.println(obj9.wheeledName);
		System.out.println(obj9.type);
		System.out.println("------");
		
		Chariot obj10=new Chariot("twoWheeld",'Y');
		System.out.println(obj10.type);
		System.out.println(obj10.avalibleInIndia);
		
		System.out.println("------");
		
		Chariot obj11=new Chariot(12.9f,"subhadra");
		System.out.println(obj11.feet);
		System.out.println(obj11.indiaChariots);
		
		
		
		
		
		
	}

}
		
	

