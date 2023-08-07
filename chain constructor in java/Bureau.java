
class Bureau
{
	int noOfDoors;
	boolean hasMirror;
	static String material;
	static boolean storesItems;

	public void instanceVariable()
	{
		System.out.println("noOfDoors:"+ noOfDoors);
		System.out.println("hasMirror:"+hasMirror);
	}

	static void staticVariable()
	{
		System.out.println("madeFrom: "+material);
		System.out.println("storesItems:"+storesItems);

	}

	Bureau(int noOfDoors, boolean hasMirror)
	{
		this.noOfDoors = noOfDoors;
		this.hasMirror = hasMirror;
	}

	static
	{
		material = "Metalic";
		storesItems = true;
	}
