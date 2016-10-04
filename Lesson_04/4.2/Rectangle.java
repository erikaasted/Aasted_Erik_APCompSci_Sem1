import java.util.Scanner;

public class Rectangle
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("What is the length?");
		double l = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is the width?");
		double w = kb.nextDouble();
		kb.nextLine();


		double perimeter = rectangle.calcPerim(l, w);
		rectangle.print(perimeter);
	}

	public double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}

	public static void print(double perimeter)
	{
		System.out.printf("The average is %.4f", perimeter);
	}
}