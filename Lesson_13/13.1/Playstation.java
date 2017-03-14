public class Playstation extends Console
{
	public Playstation()
	{
		super("Playstation");
	}

	public Playstation(String p)
	{
		super(p);
	}

	public String getController()
	{
		return "SP DualShock 3";
	}

	public String getPlatform()
	{
		return "Playstation";
	}
}