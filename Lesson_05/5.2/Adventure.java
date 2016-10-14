import java.util.Scanner;

public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("You find yourself in a bland room with two doors. Which would you like to go through?");
		String door = kb.nextLine();

		if (door.equals("right") || door.equals ("Right"))
		{
			System.out.println("You find yourself in a kind of closet. You see a hatch in the floor. Would you like to open it?");
			String hatch = kb.nextLine();
			if (hatch.equals("yes") || hatch.equals("Yes"))
			{
				System.out.println("A spring charged trap is triggered. A knife comes shooting at you. You have been stabbed.");
			}
			else if (hatch.equals("no") || hatch.equals("No"))
			{
				System.out.println("After carefully inspecting the hatch, you see it is a trap. You could have died!");
			}
			else 
			{
				System.out.println("INVALID INPUT");
			}
		}
		else if (door.equals("left") || door.equals("Left"))
		{
			System.out.println("You stuble down a long hallway, the light behind you continues to fade.");
			System.out.println("It begins to get colder and colder. You eventually see a light and a ladder. Would you like to climb it?");
			String climb = kb.nextLine();
			if (climb.equals("yes") || climb.equals("Yes"))
			{
				System.out.println("At the top of the ladder you find a heavy metal cover. After moving it, you find yourself on a crowded city block, it looks like you were in the sewer.");
			}
			else if (climb.equals("no") || climb.equals("No"))
			{
				System.out.println("You sit there, forever. Unwilling to take risks.");
			}
			else
			{
				System.out.println("INVALID INPUT");
			}
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
	}
}