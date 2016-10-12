public class Dice
{
	static int player, computer;

	public static void main(String[]args)
	{
		player = 1 + (int)((Math.random())* 6);
		computer = 1 + (int)((Math.random())* 6);

		System.out.println("You rolled " + player);
		System.out.println("The computer rolled " + computer);
		rollDice();
	}

	public static void rollDice()
	{
		if (player > computer)
			System.out.println("You won!");

		if (player < computer)
			System.out.println("You lost :(");

		if (player == computer)
			System.out.println("It's a tie! You both rolled " + player + "\n");
	}
}