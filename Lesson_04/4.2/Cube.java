import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Cube surface = new Cube();

		System.out.println("What is the side length of the cube?");
		double side = kb.nextDouble();
		kb.nextLine();

		double sa = surface.calcSurface(side);
		surface.print(sa);
	}

		public double calcSurface(double side)
	{
		return (6 * (side * side));
	}

		public static void print(double sa)
	{
		System.out.printf("The surface area is %.4f", sa);
	}
}