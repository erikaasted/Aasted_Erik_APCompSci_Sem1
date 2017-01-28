public class Inventory
{
	private String manufacturer, name, category;
	private int upc, price;

	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		upc = 0;
		price = 0;
	}

	public Inventory(String manufact, String nme)
	{
		manufacturer = manufact;
		name = nme;
		category = "Undefined";
		price = 0;
		upc = (int)(Math.random() * 999999999) + 0;
	}

	public Inventory(String manufact, String nme, String cat, int pric)
	{
		manufacturer = manufact;
		name = nme;
		category = cat;
		price = pric;
		upc = (int)(Math.random() * 999999999) + 0;
	}

	public String toString()
	{
		return "Item Info:\n" + "Name:             " + name + "\n" + "Manufacturer:     "
		 + manufacturer + "\n" + "Category:         " + category + "\n" + "Price:            "
		  + price + "\n" + "UPC#:             " + upc + "\n";
	}
}