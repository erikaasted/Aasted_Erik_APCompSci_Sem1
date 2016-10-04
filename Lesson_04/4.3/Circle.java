import java.util.Scanner;

public class Circle
{
	static double r, area;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is the radius of the circle?");
		r = kb.nextDouble();
		kb.nextLine();

		calcArea();
		print();
	}

		public static void calcArea()
	{
		area = (3.141592653 * (r * r));
	}

		public static void print()
	{
		System.out.printf("The area of a circle with radius %.2f is %.4f", r, area);
	}
}
