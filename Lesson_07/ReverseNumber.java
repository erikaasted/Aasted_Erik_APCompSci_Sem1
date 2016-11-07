import java.util.Scanner;

public class ReverseNumber
{
	static int num, rev, augnum;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number:");
		num = kb.nextInt();
		augnum = num;
		rev = 0;

		getReverse();

		System.out.printf("%d reversed is %d\n", num, rev);

	}

	public static void getReverse()
	{
		while (augnum > 0)
		{
			rev *= 10;
			rev += (augnum % 10);
			augnum /= 10;

		}
	}
}