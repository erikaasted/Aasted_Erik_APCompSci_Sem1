import java.util.Scanner;
public class Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number you want to count to:");
		int number = kb.nextInt();
		System.out.println("Enter interval:");
		int interval = kb.nextInt();

		for (int i = interval; i <= number; i+= interval)
		{
			System.out.println(i + " ");
		}
	}
}