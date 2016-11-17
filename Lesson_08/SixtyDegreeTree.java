import java.util.Scanner;

public class SixtyDegreeTree
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a word:");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 0;

		tree(word, start, stop);
	}

	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%15s\n",word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}