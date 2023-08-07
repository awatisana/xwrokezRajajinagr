class EngineInfo
{ 
        public static void main(String[] args)
	{
        System.out.println("engine running information");
		
         int ref=Engine.getCCByModel("swift");
		 System.out.println("ref is:"+ref);
		 
		 int ref=Engine.getCCByModel("rapid");
		 System.out.println("ref is:"+ref);
		 
		 int ref=Engine.getCCByModel("bwm");
		 System.out.println("ref is:"+ref);
		
		int ref=Engine.getCCByModel("benz");
		 System.out.println("ref is:"+ref);
		
		int ref=Engine.getCCByModel("audi");
		 System.out.println("ref is:"+ref);
		
		int ref=Engine.getCCByModel("bently");
		 System.out.println("ref is:"+ref);
		
	

		Engine.getCCByModel("car");
		 
	}
}
