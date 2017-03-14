public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure one = new AFigure("one");
		Car two = new Car("two");

		System.out.println(one.toString());
		System.out.println(two.toString());
	}
}