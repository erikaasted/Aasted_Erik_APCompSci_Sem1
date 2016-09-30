import java.util.Scanner;

public class Average
{
	static double num1, num2, num3;
	static double avg;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the first number:");
		num1 = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter the second number:");
		num2 = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter the third number:");
		num3 = kb.nextDouble();
		kb.nextLine();

		average();

		print();

	}

	public static void average()
	{
		avg = (num1 + num2 + num3) / 3;
	}

	public static void print()
	{
		System.out.println("The average is " + avg);
	}
}