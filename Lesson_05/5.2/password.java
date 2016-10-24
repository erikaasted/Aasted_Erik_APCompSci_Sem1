import java.util.Scanner;

public class password
{

	public static void main(String[]args)
	{
		String correctusername = "tirefrier";
		String correctpassword = "password";

		boolean correct = passCheck(correctusername, correctpassword);

		if (correct == true)
			System.out.println("Access Granted");
	}

	public static boolean passCheck(String correctusername, String correctpassword)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Username:");
		String username = kb.nextLine();
		System.out.println("Enter Password:");
		String password = kb.nextLine();

		if (username.equals(correctusername) && password.equals(correctpassword))
		{
			return true;
		}

		if (!username.equals(correctusername))
		{
			if (password.equals(correctpassword))
			{
				System.out.println("Incorrect Username");
				passCheck(correctusername, correctpassword);
				return true;
			}
			if (!(password.equals(correctpassword)))
			{
				System.out.println("Incorrect Username and Password");
				passCheck(correctusername, correctpassword);
				return true;
			}
		}
		return false;
	}
}