import java.util.Scanner;

public class AverageNumbers
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = 1 + (int)(Math.random() * 100);
		}

		System.out.println("Numbers...");

		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%d ", numbers[i]);
		}

		System.out.println(" ");

		System.out.println("The average of the above numbers is " + average(numbers));

	}

	public static double average(int[] numbers)
	{
		int average = 0;

		for (int i = 0; i < numbers.length; i++)
		{
			average += numbers[i];
		}

		average /= numbers.length;

		return average;
	}
}