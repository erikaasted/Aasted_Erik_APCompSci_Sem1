import java.util.Scanner;

public class Rectangle
{
	static double l, w;
	static double perimeter;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is the length?");
		l = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is the width?");
		w = kb.nextDouble();
		kb.nextLine();

		calcPerim();

		print();
	}

	public static void calcPerim()
	{
		perimeter = 2 * (l + w);
	}

	public static void print()
	{
		System.out.printf("The perimeter is %.4f", perimeter);
	}
}