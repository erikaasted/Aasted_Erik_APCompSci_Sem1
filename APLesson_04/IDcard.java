import java.util.Scanner;

public class IDcard
{
	public static void main(String[]args)
	{
		IDcard form = new IDcard();
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your first name:");
		String firstname = kb.nextLine();
		System.out.print("Enter your last name:");
		String lastname = kb.nextLine();
		System.out.print("Enter your title:");
		String title = kb.nextLine();
		System.out.print("Enter the school site:");
		String school = kb.nextLine();
		System.out.print("Enter the school year:");
		String year = kb.nextLine();
		System.out.print("Enter your subject:");
		String subject = kb.nextLine();

		System.out.println("********************************");
		form.format(school, year);
		form.format(lastname, firstname);
		form.format(title, subject);
		System.out.println("********************************");
	}

	public void format(String word1, String word2)
	{
		System.out.printf("* %13s  %13s *\n", word1, word2);
	}
}