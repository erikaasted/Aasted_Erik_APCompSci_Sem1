import java.util.Scanner;
public class GameGun
{
	static int bulletCount, shotCount;
	static int magazineSize = 16;
	static String[]magazine = new String[magazineSize];

	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		Scanner kb = new Scanner(System.in);

		resetMagazine();

		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.next();

			if (action.equals("r"))
			{
				reload();
			}
			else if (action.equals("s"))
			{
				System.out.println(shoot());
			}
			printMagazine();
		}
		System.out.println("Out of Bullets!");
	}

	public static void resetMagazine()
	{
		for (int i = 0; i < magazine.length; i++)
		{
			magazine[i] = "[]";
		}
	}

	public static String shoot()
	{
		if (shotCount > 0)
		{
			magazine[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!";
		}
		else
		{
			return "Reload!";
		}
	}

	public static void reload()
	{
		if (bulletCount >= magazineSize)
		{
			bulletCount -= magazineSize;
			shotCount = magazineSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetMagazine();

		for (int i = 0; i < shotCount; i++)
		{
			magazine[i] = " * ";
		}
	}

	public static void printMagazine()
	{
		String output = "";

		output += "Bullets:     " + bulletCount + "\n" + "Magazine:    ";
		for (int i = 0; i < magazineSize; i++)
		{
			output += magazine[i];
		}

		System.out.println(output);
	}

}























