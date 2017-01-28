import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Input your hair color: ");
		String hair = kb.nextLine();
		System.out.println("Input your eye color: ");
		String eyes = kb.nextLine();
		System.out.println("Input your skin color: ");
		String skin = kb.nextLine();

		Human person = new Human(hair, eyes, skin);

		System.out.println("My Info: ");
		System.out.printf("Hair Color:     %10s%n", person.getHair());
		System.out.printf("Eye Color:      %10s%n", person.getEyes());
		System.out.printf("Skin Color:     %10s%n", person.getSkin());

		System.out.println("Input your friend's hair color: ");
		hair = kb.nextLine();
		System.out.println("Input your friend's eye color: ");
		eyes = kb.nextLine();
		System.out.println("Input your friend's skin color: ");
		skin = kb.nextLine();

		person.setHES(hair, eyes, skin);

		System.out.println("My Friend's Info: ");
		System.out.printf("Hair Color:     %10s%n", person.getHair());
		System.out.printf("Eye Color:      %10s%n", person.getEyes());
		System.out.printf("Skin Color:     %10s%n", person.getSkin());
	}
}