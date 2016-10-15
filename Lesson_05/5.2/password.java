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


//Password is incorrect - tells the user “Your password is incorrect!”, and allows the user to try again. 
//Username is incorrect - tells the user “Your username is incorrect!”, and allows the user to try again. 
//Password and Username are incorrect -  tells the user “Your username and password are incorrect”, and allows the user to try again. 


//If the username and password are correct, there is no recursive call. The program simply prints “You are granted access!”


//main() method
//Set variables for password and username (no inputs needed)
//Run passCheck()

//passCheck() method
// Set user inputs for the input username and password. 
 
// If username and password are correct
//    “You are granted access!”
// Otherwise…
//        “Your password is incorrect!”
//    If password is correct
//        “Your username is incorrect!”
//    Otherwise…
//        “Your username and password are incorrect!”