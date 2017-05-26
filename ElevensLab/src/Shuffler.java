/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args)
    {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8};

		for (int j = 1; j <= SHUFFLE_COUNT; j++)
		{
			perfectShuffle(values1);
			System.out.print("  " + j + ":");

			for (int k = 0; k < values1.length; k++)
			{
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive Erik style shuffles:");
        int[] values3 = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int j = 1; j <= SHUFFLE_COUNT; j++)
        {
            myShuffle(values3);
            System.out.print("  " + j + ":");

            for (int k = 0; k < values3.length; k++)
            {
                System.out.print(" " + values3[k]);
            }
            System.out.println();
        }
        System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values)
	{
		int[] shuffled = new int[values.length];
		int[] firsthalf = new int[values.length/2];
		int[] secondhalf = new int[values.length/2];

		for (int i = 0; i < values.length/2; i++)
      {
          firsthalf[i] = values[i];
      }

      for (int i = 0; i < values.length/2; i++)
      {
          secondhalf[i] = values[firsthalf.length + i];
      }

      int k = 0;
      for (int i = 0; i < shuffled.length/2; i++)
      {
          shuffled[k] = firsthalf[i];
          k += 2;
      }

      k = 0;
      for (int i = 0; i < shuffled.length/2; i++)
      {
          shuffled[k+1] = secondhalf[i];
          k += 2;
      }

        System.arraycopy(shuffled, 0, values, 0, values.length - 1);
    }


	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values)
    {
		for (int k = values.length - 1; k >= 0; k--)
        {
            int r = 0;
            for (int i = 0; i < values.length; i++)
                if (values[i] > r)
                    r = values[i];
            int temporary = values[k];
            values[k] = values[r - 1];
            values[r - 1] = temporary;
        }
	}

	public static void myShuffle(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            int rand = (int) (Math.random() * (values.length));
            int temp = values[i];
            values[i] = values[rand];
            values[rand] = temp;
        }
    }

    public static String flip()
    {
        if (Math.random() > 0.333)
            return "head";
        else
            return "tails";
    }

    public static boolean arePermutations(int[] one, int[] two)
    {
        if (one.length == two.length)
        {
            for (int i = 0; i < one.length; i++)
            {
                boolean test = false;

                for (int j = 0; j < one.length; j++)
                {
                    if (one[i] == two[j])
                        test = true;
                }

                return test;
            }
        }
        return false;
    }
}








