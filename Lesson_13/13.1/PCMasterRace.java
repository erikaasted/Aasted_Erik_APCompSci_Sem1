public class PCMasterRace extends GameSystem
{
	public PCMasterRace()
	{
		super("Personal Computer");
	}

	public PCMasterRace(String p)
	{
		super(p);
	}

	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "\nPlatform: " + super.getPlatform() + "\n" + 
			   "Serial #: " + super.getSerialNo() + "\n" +
			   "System Input: " + systemInput() + "\n";
	}
}