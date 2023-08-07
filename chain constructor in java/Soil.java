class Soil
{
	static String soilTexture;
	static String soilChemistry;
	String Color;
	String mineralParticals;

	public void InstanceVariable()
	{
		System.out.println("Color: " +Color);
		System.out.println("mineralParticals: " +mineralParticals);
	}

	static void StaticVariable()
	{
		System.out.println("soilTexture: " +soilTexture);
		System.out.println("soilChemistry: " +soilChemistry);
	}

	Soil(String Color, String mineralParticals)
	{
		this.Color = Color;
		this.mineralParticals = mineralParticals;
	}

	static
	{
		soilTexture = "Sand,Stone";
		soilChemistry = "Clay";
	}
}
