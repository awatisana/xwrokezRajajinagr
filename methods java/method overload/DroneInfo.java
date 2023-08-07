class DroneInfo
{
 public static void main(String[] args)
	{
        System.out.println("Drone running information");
		
         double ref=Drone.getDistanceByFlight("sahil","search");
		 System.out.println("ref is :"+ref);
		 
		 double ref1=Drone.getDistanceByFlight("abid","viewContent");
		 System.out.println("ref1 is:"+ref1);
		 
		 Drone.getDistanceByFlight(" operator","event");
		 
		
         double ref=Drones.getPriceByEvent("college event");
		 System.out.println("ref is :"+ref);
		 
		 double ref1=Drones.getPriceByEvent("networking event");
		 System.out.println("ref1 is:"+ref1);
		 
		 Drones.getPriceByEvent("  eventName");
		
		 
		 int ref=Drone.getDiscountByEvent("college event","sana");
		 System.out.println("ref is :"+ref);
		 
		 int ref1=Drone.getDiscountByEvent("networking event","awati");
		 System.out.println("ref1 is:"+ref1);
		 
		 Drone.getDiscountByEvent("  eventName","refPerson");
	}
}
		 
		 