import java.util.Scanner;
public class Strings
{
	public static void main(String[]args)
	{
		String[][]words = new String [4][4];
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				System.out.printf("Enter word for row %d, column %d:  ", i+1, j+1);
				words[i][j] = kb.nextLine();
			}
		}

		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				System.out.printf("%s ", words[i][j]);
			}
			System.out.printf("\n");
		}
	}
}