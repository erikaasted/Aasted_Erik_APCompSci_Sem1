public class Song
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		String word2 = "Hey";
		String word3 = "Goodbye!";

		sing(word1, 4);
		sing(word1, 4);
		sing(word2, 3);
		sing(word3, 1);
	}
	public static void sing(String word, int repeat)
	{
		for (int i = 0; i < repeat; i++)
		{
			System.out.printf("%s ", word);
		}
		System.out.printf("\n");
	}
}