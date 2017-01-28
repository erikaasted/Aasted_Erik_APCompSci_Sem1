import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter distance in miles:");
		int dist = kb.nextInt();

		System.out.println("Enter hours:");
		int hour = kb.nextInt();

		System.out.println("Enter minutes:");
		int minu = kb.nextInt();

		MilesPerHour object = new MilesPerHour(dist, hour, minu);

		object.setValues(dist, hour, minu);

		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph.%n", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
	}
}