/**
 * Card.java
 * <p>
 * <code>Card</code> represents a playing card.
 */
public class Card {
	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue)
	{
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String getsuit()
	{
		return suit;
	}

	public String getrank()
	{
		return rank;
	}

	public int getpointValue()
	{
		return pointValue;
	}

	public boolean matches(Card otherCard)
	{
		if (otherCard.getpointValue() == this.getpointValue())
			if (otherCard.getsuit() == this.getsuit())
				if (otherCard.getrank() == this.getrank())
					return true;
		return false;
	}

	@Override
	public String toString()
	{
		String back = (" " + rank + " of " + suit + ". Point Value = " + pointValue);
		return back;
	}
}
