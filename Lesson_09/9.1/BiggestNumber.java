import java.util.Scanner;
public class BiggestNumber
{
	static int[] numbers;
	public static void main(String[] args)
	{
		numbers = new int[10];

		fillArray();

		System.out.printf("For the following numbers: ");
		printArray(numbers);
		System.out.println("\nThe biggest number is " + getBiggest(numbers));
	}

	public static void fillArray()
	{
		for (int i=0; i < numbers.length; i++)
		{
			numbers[i] = 1 + (int)(Math.random() * 100);
		}
	}

	public static void printArray(int[] array)
	{
		for (int i=0; i < array.length; i++)
		{
			System.out.printf("%d ", array[i]);
		}
	}

	public static int getBiggest(int[] array)
	{
		int max = 0;
		for (int i : array)
		{
			if (i > max)
			{
				max = i;
			}
		}
		return max;
	}

}