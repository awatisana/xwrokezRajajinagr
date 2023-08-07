class Flight{
	public static void main(String[] args)
	{
		System.out.println("Flight names type");
		String akasaair="Akasaair";
	   String gofirst="Gofirst";
		String indigo="Indigo";
       String splicejet="Splicejet";
        String gulfair="Gulfair";
        String saudiababian="Saudiababian";
        String ballistic="Ballistic";
        String buoyant="Buoyant";
		
		String[] flights={akasaair,gofirst,indigo,splicejet,gulfair,saudiababian,ballistic,buoyant};
         
        for(int name=0;name<=7;name++)
		{
			System.out.println("flights name before change:"+ name + "is" + flights[name]);
		}
		flights[4]="airindia";
         System.out.println("========================\n");
        for(int name=7; name>=0;name--)
		{
			System.out.println("flights name before change:"+ name+"is"+ flights[name]);
		}			
	}
}	