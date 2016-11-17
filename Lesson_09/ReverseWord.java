import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];

		for (int i=0; i < words.length; i++)
		{
			System.out.println("Enter word " + (i+1) );
			words[i] = kb.nextLine();
		}

		System.out.println("In order...");

		for (int i=0; i < words.length; i++)
		{
			System.out.println((i+1) + ": " + words[i]);
		}

		System.out.println(" ");

		System.out.println("Reversed...");

		reverse(words);


	}

	public static void reverse(String words)
	{
		
	}
}



