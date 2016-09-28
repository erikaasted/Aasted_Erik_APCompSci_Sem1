public class Lab_02area
{
	public static void main(String[]args)
	{
		double pi = 3.141592653;
		int r = 7;
		double circleArea = (pi * (r * r));

		System.out.println("The area of the circle is " + circleArea);
		//Finds and prints area of a circle

		double circleVolume = (4 * pi * (r * r * r) / 3);

		System.out.println("The volume of a sphere with the same radius is " + circleVolume);
		//finds and prints volume of a sphere
	}
}
