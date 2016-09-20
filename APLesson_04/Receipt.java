import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter Item 1 Name:");
		String item1 = kb.nextLine();
		System.out.print("Enter Item 1 Price:");
		double price1 = kb.nextDouble();
		kb.nextLine();

		System.out.print("Enter Item 2 Name:");
		String item2 = kb.nextLine();
		System.out.print("Enter Item 2 Price:");
		double price2 = kb.nextDouble();
		kb.nextLine();

		System.out.print("Enter Item 3 Name:");
		String item3 = kb.nextLine();
		System.out.print("Enter Item 3 Price:");
		double price3 = kb.nextDouble();
		kb.nextLine();


		System.out.println("<<<<<<<<<<<<<<<__RECEIPT__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
	}

	public void format(String item, double price)
	{
		//System.out.printf("\n%10s %10.2f", item, price);
		System.out.printf("  \n%10s ........      %10.2f", item, price);

	}
}