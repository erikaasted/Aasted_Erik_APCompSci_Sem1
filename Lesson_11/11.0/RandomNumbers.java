public class RandomNumbers
{
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4];

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums.length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100 + 1);
			}
		}

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums.length; j++)
			{
				System.out.printf("%3d ", nums[i][j]);
			}

			System.out.printf("\n");
		}
	}
}