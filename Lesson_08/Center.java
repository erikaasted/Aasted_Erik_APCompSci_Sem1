import java.util.Scanner;

public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Center center = new Center(); 

		System.out.println("Enter word one: ");
		String word1 = kb.nextLine();
		System.out.println("Enter word two: ");
		String word2 = kb.nextLine();
		System.out.println("Enter word three: ");
		String word3 = kb.nextLine();

		System.out.println(center.makeCenter(word1));
		System.out.println(center.makeCenter(word2));
		System.out.println(center.makeCenter(word3));
	}

	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			return word;
		}
		else
		{
			word = (" " + word + " ");
			return makeCenter(word);
		}
	}
}
