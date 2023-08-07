class Camera{
        static void click(String Location,int date,int howManyPeople,float resolution,String clarity,String cameraMan) 
		{
            System.out.println("Camera information......");
            System.out.println("Location:" +"jamkhandi");
            System.out.println("date:" +2001);
            System.out.println("howManyPeople: " + 6);
            System.out.println("resolution:" +67.0f);
            System.out.println("clarity:" + "clear");
			System.out.println("cameraMan:"+"sana");

            if (Location!= null)
			{
                System.out.println("Camera location is valid");
            } 
			else 
			{
                System.err.println("Camera location is invalid");
				return;
            }
			if (date!= 9)
			{
                System.out.println("Camera date is valid");
            } 
			else 
			{
                System.err.println("Camera date is invalid");
				return;
            }
			if (howManyPeople!= 6)
			{
                System.out.println("Cake howManyPeople is invalid");
            } 
			else 
			{
                System.err.println("Cake howManyPeople is invalid");
				return;
            }
			if (resolution!= 67.0f)
			{
                System.out.println("Camera resolution is valid");
            } 
			else 
			{
                System.err.println("Camera resolution invalid");
				return;
            }
			if (clarity!= null)
			{
                System.out.println("Camera clarity is valid");
            } 
			else 
			{
                System.err.println("Camera clarity is invalid");
				return;
            }
			if (cameraMan!= null)
			{
                System.out.println("cameraMan is valid");
            } 
			else 
			{
                System.err.println("cameraMan is invalid");
				return;
            }
        }
   

	public static void main(String[] args)
	{
        System.out.println("Camera information");
		
        Camera.click("jamkhandi",2001,6,67.0f,"clear","sana");
	}	
    
}