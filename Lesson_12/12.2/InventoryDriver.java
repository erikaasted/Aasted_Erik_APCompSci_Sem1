import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter item name: ");
		String name = kb.nextLine();
		System.out.println("Enter item manufacturer: ");
		String manufact = kb.nextLine();
		System.out.println("Entering category and price? (y/n)");
		String choice = kb.nextLine();

		if (choice.equals("y"))
		{
			System.out.println("Enter Category: ");
			String category = kb.nextLine();

			System.out.println("Enter Price: ");
			int price = kb.nextInt();

			Inventory item1 = new Inventory(manufact, name, category, price);

			System.out.println(item1);
		}
		else
		{
			Inventory item1 = new Inventory(manufact, name);

			System.out.println(item1);
		}
	}
}