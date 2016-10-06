public class Dice
{
	static int player, computer;

	public static void main(String[]args)
	{
		player = 1 + (int)((Math.random())* 6);

		computer = 1 + (int)((Math.random())* 6);

		rollDice();
	}

	public static void rollDice()
	{
		if (player > computer)
			System.out.println("You lost with " + player + ", the computer rolled " + computer + "\n");

		if (player < computer)
			System.out.println("You lost with " + player + ", the computer rolled " + computer + "\n");

		if (player == computer)
			System.out.println("It's a tie! You both rolled " + player + "\n");
	}
}







//main() method
//Set the player roll integer to a random number between 1 and 6
//Set the computer roll integer to a random number between 1 and 6


//Run rollDice()


//Print “You rolled a <your roll>”
//Print “Computer rolled a <computer’s roll>”
//Print “The winner is <winner>”


//rollDice() method
//If you roll higher than the computer
//   Winner is you 
//If computer rolls higher
//   Winner is computer