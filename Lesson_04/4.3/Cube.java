import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is the side length of the cube?");
		side = kb.nextDouble();
		kb.nextLine();

		calcSurface();
		print();
	}

		public static void calcSurface()
	{
		sa = (6 * (side * side));
	}

		public static void print()
	{
		System.out.printf("The surface area is %.4f", sa);
	}
}
