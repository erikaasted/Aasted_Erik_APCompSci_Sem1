import java.util.Scanner;
public class FindTheZs
{
	static String[] words;
	public static void main(String[] args)
	{
		words = new String[5];

		fillStringArray();
		System.out.printf("Of the following words: "); 
		printArray();
		System.out.printf("\nThese have Zs: %s", hasZs());
		System.out.printf("\n");
	}

	public static void fillStringArray()
	{
		Scanner kb = new Scanner(System.in);
		for (int i=0; i < words.length; i++)
		{
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = kb.nextLine();
		}
	}

	public static void printArray()
	{
		for (int i=0; i < words.length; i++)
		{
			System.out.printf("%s ", words[i]);
		}
		System.out.printf("\n");
	}

	public static String hasZs()
	{
		String zs = "";
		for (int i=0; i < words.length; i++)
		{
			if (words[i].indexOf("z") >= 0 || words[i].indexOf("Z") >= 0)
			{
				zs += words[i];
				zs += " ";
			}
		}
		return zs;
	}
}













