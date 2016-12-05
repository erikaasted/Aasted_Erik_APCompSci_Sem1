import java.util.Scanner;
public class GetOdds
{
	static int[] numbers;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		numbers = new int[10];

		fillArray();

		System.out.printf("Of the following numbers: ");
		printArray();
		System.out.printf("\nThese are the odd numbers: ");
		System.out.printf(getOdds(numbers));

	}

	public static void fillArray()
	{
		for (int i=0; i < numbers.length; i++)
		{
			numbers[i] = 1 + (int)(Math.random() * 100);
		}
	}

	public static void printArray()
	{
		for (int i=0; i < numbers.length; i++)
		{
			System.out.printf("%d ", numbers[i]);
		}
	}

	public static String getOdds(int[] numbers)
	{
		String odds="";
		for (int i : numbers)
		{
			if (!(i%2 == 0))
			{
				odds += i + " ";
			}
		}

		return odds;
	}
}









