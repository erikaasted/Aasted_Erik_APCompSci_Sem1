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

		double subtotal = (price1 + price2 + price3);
		double tax = 1.08;
		double total = (subtotal * tax);


		System.out.println("<<<<<<<<<<<<<<<__RECEIPT__>>>>>>>>>>>>>>>>");
		System.out.println("     Item:                    Price:      ");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("                                          ");
		form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("\n__________________________________________");
		System.out.println("     * Thank you for your business *      ");
	}

	public void format(String item, double price)
	{
		System.out.printf("  \n%10s ............. %10.2f", item, price);
	}
}