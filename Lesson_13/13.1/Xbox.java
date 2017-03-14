public class Xbox extends Console
{
	public Xbox()
	{
		super("Xbox");
	}

	public Xbox(String p)
	{
		super(p);
	}

	public String getController()
	{
		return "Xbox Wireless Controller";
	}

	public String getPlatform()
	{
		return "Xbox";
	}
}