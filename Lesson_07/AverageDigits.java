import java.util.Scanner;
public class AverageDigits
{
	static int number, digits;
	static double average;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		digits = 0;
		average = 0;

		avDigits();

		System.out.printf("The average of the digits in %d is %.1f\n", number, average);
	}

	public static void avDigits()
	{
		int num = number;

		while (num > 0)
		{
			digits += 1;
			average += (num % 10);
			//System.out.println(average);?
			num /= 10;
		}

		average = (average / digits);
	}
}