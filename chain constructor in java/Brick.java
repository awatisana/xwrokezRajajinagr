class Brick
{
	static String soilUsed;
	static boolean brickBrunt;
	String shape;
	String usedFor;

	public void InstanceVariable()
	{
		System.out.println("shape:"+shape);
		System.out.println("usedFor:"+usedFor);
	}

	static void StaticVariable()
	{
		System.out.println("soilUsed:"+soilUsed);
		System.out.println("brickBrunt:"+brickBrunt);
	}

	Brick(String shape, String usedFor)
	{
		this.shape = shape;
		this.usedFor =usedFor;
	}

	static
	{
		soilUsed = "Red & Black";
		brickBrunt = true;
	}
}
 Binary file adde