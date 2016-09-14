import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please Enter A Number");

		int num = keyboard.nextInt();

		System.out.println("You entered " + num);
	}
}