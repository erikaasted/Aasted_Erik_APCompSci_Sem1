import java.util.Scanner;
public class Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a multiplier:");
		int multi = kb.nextInt();
		System.out.println("Enter size of table:");
		int size = kb.nextInt();

		for (int i = 1; i <= size; i++)
		{
			System.out.printf("for x=%d, y=%d\n", i, (i * multi));
		}
	}
}