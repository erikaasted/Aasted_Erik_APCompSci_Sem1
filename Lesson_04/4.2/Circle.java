import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Circle circle = new Circle();

		System.out.println("What is the radius of the circle?");
		double r = kb.nextDouble();
		kb.nextLine();

		double area = circle.calcArea(r);
		circle.print(r, area);
	}

		public double calcArea(double r)
	{
		return (3.141592653 * (r * r));
	}

		public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with radius %.2f is %.4f", r, area);
	}
}
