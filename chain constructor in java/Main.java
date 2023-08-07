class Main
{
	public static void main(String[] args)
	{
		Soil soil = new Soil("Red", "Water,Air,Stones");
		soil.InstanceVariable();
		Soil.StaticVariable();
		System.out.println("++++++++++++++++++++++++++++");

		Bureau bureau = new Bureau(2, true);
		bureau.instanceVariable();
		Bureau.staticVariable();
		System.out.println("++++++++++++++++++++++++++++");

		Helmate helmate = new Helmate(1000,'m');
		helmate.InstanceVariable();
		Helmate.staticVariable();
		System.out.println("+++++++++++++++++++++++++++++");

		Candle candle = new Candle('M', 15);
		candle.InstanceVariable();
		Candle.StaticVariable();
		System.out.println("++++++++++++++++++++++++++++++");

		Brick brick = new Brick("Rectangle", "Construction");
		brick.InstanceVariable();
		Brick.StaticVariable();
		System.out.println("+++++++++++++++++++++++++++++++");

		ButterFly butterfly = new ButterFly(2, true);
		butterfly.instanceVariable();
		ButterFly.staticVariable();
		System.out.println("++++++++++++++++++++++++++++++");

		Power power = new Power(50, 100);
		power.instanceVariable();
		Power.staticVariable();



	}
}
 