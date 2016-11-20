import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];

		for (int i = 0; i < words.length; i++)
		{
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = kb.nextLine();
		}

		System.out.println(" ");
		first(words);
	}

	public static void first(String [] words)
	{
		for (int i = 0; i < words.length; i++)
		{
			System.out.println(words[i].charAt(0));
		}
	}
}