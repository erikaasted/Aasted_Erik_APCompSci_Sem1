import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Starting Number:");
		int start = kb.nextInt();

		System.out.println("Enter Sequence Size:");
		int size = kb.nextInt();

		int[] seq = new int[size];

		for (int i=0; i < seq.length; i++)
		{
			if (i == 0 || i == 1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = (seq[i-1] + seq[i-2]);
			}

			System.out.println(seq[i] + " ");
		}

	}
}