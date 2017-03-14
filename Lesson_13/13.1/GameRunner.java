public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem one = new PCMasterRace();
		GameSystem two = new Xbox();
		GameSystem three = new Playstation();

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}