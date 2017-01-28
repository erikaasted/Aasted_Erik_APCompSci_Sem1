import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fN = kb.nextLine();
		System.out.println("Enter your last name: ");
		String lN = kb.nextLine();

		System.out.println("Would you like to create an avatar? (y/n)");
		String choice = kb.nextLine();

		if (choice.equals("y"))
		{
			System.out.println("Please enter an avatar: ");
			String av = kb.nextLine();
			User user1 = new User(fN, lN, av);
			System.out.println(user1);
		}
		else
		{
			User user1 = new User(fN, lN);
			System.out.println(user1);
		}
	}
}