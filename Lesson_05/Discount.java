import java.util.Scanner;

public class Discount
{

	static double total, subtotal, discount, item1cost, item2cost, item3cost, item4cost;
	static double tax = 1.08;
	static String item1name, item2name, item3name, item4name;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Discount percentoff = new Discount();

		System.out.println("What is the name of the first item?");
		item1name = kb.nextLine();
		System.out.println("What is the price?");
		item1cost = kb.nextDouble();
		kb.nextLine();

		System.out.println("What is the name of the second item?");
		item2name = kb.nextLine();
		System.out.println("What is the price?");
		item2cost = kb.nextDouble();
		kb.nextLine();

		System.out.println("What is the name of the third item?");
		item3name = kb.nextLine();
		System.out.println("What is the price?");
		item3cost = kb.nextDouble();
		kb.nextLine();

		System.out.println("What is the name of the fourth item?");
		item4name = kb.nextLine();
		System.out.println("What is the price?");
		item4cost = kb.nextDouble();
		kb.nextLine();

		subtotal = (item1cost + item2cost + item3cost + item4cost);
		discount = percentoff.discount(subtotal);
		total = ((subtotal - (subtotal * discount)) * tax);

		format();

	}

	public static double discount(double subtotal)
	{
		if (subtotal >= 2000)
			return 0.15;
		return 0;
	}

	public static void format()
	{
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		System.out.printf("%9s ................. $%.2f\n", item1name, item1cost);
		System.out.printf("%9s ................. $%.2f\n", item2name, item2cost);
		System.out.printf("%9s ................. $%.2f\n", item3name, item3cost);
		System.out.printf("%9s ................. $%.2f\n", item4name, item4cost);
		System.out.println("__________________________________");
		System.out.printf("%9s ................. $%.2f\n", "Subltotal", subtotal);
		System.out.printf("%9s ................. $%.2f\n", "Discount", discount);
		System.out.printf("%9s ................. %.2s%%\n", "Tax", "8");
		System.out.println("__________________________________\n");
		System.out.printf("%9s ................. $%.2f\n", "Total", total);
		System.out.println("__________________________________\n");
		System.out.println("____________THANK YOU_____________\n");


	}
}