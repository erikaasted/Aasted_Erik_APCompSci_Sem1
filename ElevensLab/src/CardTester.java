/**
 * This is a class that tests the Card class.
 */
public class CardTester
{
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card one = new Card("King", "Spades", 12);
		Card two = new Card("Queen", "Hearts", 11);
		Card three = new Card("10", "Diamonds", 9);

		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
	}
}
