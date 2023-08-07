class City{
	
	String cityName="jamkhandi";
	int pin=587301;
	String area="awatiGalli";
	char cityIsDistrict='N';
	
	
	City()
	{
		System.out.println("invoking the city with no argument");
		System.out.println("from the city:"+this.cityName);
		System.out.println("from the city:"+this.cityIsDistrict);
		
	}
	
	City(String area,int pic)
	{
		System.out.println("---------------------");
		System.out.println("invoking the city with argument");
		this.area=area;
		this.pin=pin;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(" invoking main in city");
		
		City city= new City();
		City city2= new City("awatiGalli",587301);
		System.out.println(city2.area); 
	    System.out.println(city2.pin);

	} 
}	
	
