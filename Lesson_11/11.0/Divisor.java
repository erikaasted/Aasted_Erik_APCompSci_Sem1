import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		int[][]nums = new int[4][4];
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100 + 1);
				System.out.printf("%3d  ", nums[i][j]);
			}
			System.out.printf("\n");
		}

		System.out.println("Please Enter A Number:");
		int divisor = kb.nextInt();

		int count = 0;

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % divisor == 0)
				{
					count += 1;
				}
			}
		}

		System.out.printf("There are %d numbers divisible by %d in the Array.\n", count, divisor);

	}
}