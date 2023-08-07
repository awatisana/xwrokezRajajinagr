class Cake{
        static void tasty(String name, String type, String bakeryName, float price, int noOfPieces,String ocassion) 
		{
            System.out.println("Cake is tasty......");
            System.out.println("Name: " + "name");
            System.out.println("Type: " + "type");
            System.out.println("Bakery Name: " + "bakeryName");
            System.out.println("Price: " + "price");
            System.out.println("Number of Pieces: " + "noOfPieces");
			System.out.println("ocassion:"+"party");

            if (name != null)
			{
                System.out.println("Cake name is valid");
            } 
			else 
			{
                System.err.println("Cake name is invalid");
				return;
            }
			if (type != null)
			{
                System.out.println("Cake typeis valid");
            } 
			else 
			{
                System.err.println("Cake type is invalid");
				return;
            }
			if (bakeryName != null)
			{
                System.out.println("Cake bakeryName is invalid");
            } 
			else 
			{
                System.err.println("Cake bakeryName is invalid");
				return;
            }
			if (price!= 5)
			{
                System.out.println("Cake price is valid");
            } 
			else 
			{
                System.err.println("Cake priceis invalid");
				return;
            }
			if (noOfPieces!= 10)
			{
                System.out.println("Cake noOfPieces is valid");
            } 
			else 
			{
                System.err.println("Cake noOfPieces is invalid");
				return;
            }
			if (ocassion!= null)
			{
                System.out.println("Cake ocassionis valid");
            } 
			else 
			{
                System.err.println("Cake ocassion is invalid");
				return;
            }
        }
   

	public static void main(String[] args)
	{
        System.out.println("Cake information");
		
        Cake.tasty("cake", "chocolateCake", "saniya", 421.6f, 8,"party");
	}	
    
}