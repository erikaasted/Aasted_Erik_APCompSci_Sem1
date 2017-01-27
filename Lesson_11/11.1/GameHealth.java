import java.util.Scanner;
public class GameHealth
{
	static int healthLoad = 6;
	static int healthCount;
	static String[]health = new String[healthLoad];

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;

		while (!(turn.equals("Q")) && (healthCount > 0))
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();

			damage = (int)(Math.random() * 2 + 1);
			amount = (int)(Math.random() * 6 + 1);

			System.out.println(takeDamage(damage, amount));
			printMagazine();
		}

		System.out.println("You died!");
	}

	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCount -= amt;
			return "Taking " + amt + " damage!";
		}
		else
		{
			if (healthCount + amt < healthLoad)
			{
				amt += healthCount;
			}
			else
			{
				healthCount = healthLoad;
			}
		}
		return "Power up " + amt + "!";
	}

	public static void printMagazine()
	{
		String output = "Health:     ";

		for (int i = 0; i < healthLoad; i++)
		{
			if (i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = " [] ";
			}

			output += health[i];
		}

		System.out.println(output);
	}
}




















