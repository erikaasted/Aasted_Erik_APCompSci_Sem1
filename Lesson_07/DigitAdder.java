import java.util.Scanner;
public class DigitAdder
{
	static int number, sum, num;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		sum = 0;
		num = number;

		sumDigits();

		System.out.println("The sum of the digits in " + number + " is " + sum);

	}
	public static void sumDigits()
	{
		while (num > 0)
		{
			int digit = num % 10;
			System.out.println(digit);
			num /= 10;
			sum += digit;
		}
	}
}

//i have no idea how but this works