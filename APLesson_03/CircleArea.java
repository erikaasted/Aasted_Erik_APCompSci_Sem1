import java.util.Scanner;

public class circleArea
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);

		System.out.print("What is the radius of the circle?");
		double radius = kb.nextDouble();
		kb.nextLine();

		double pi = 3.141592653;
		
		double circleArea = (pi * (radius * radius));
		System.out.println("The area of the circle is " + circleArea);
		//finds area of a circle

		double circleVolume = (4 * pi * (radius * radius * radius) / 3);
		System.out.println("The volume of a sphere with the same radius is " + circleVolume);
		//finds volume of sphere
	}
}
