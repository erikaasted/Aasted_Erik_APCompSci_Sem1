import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.");

		System.out.println("What is your name?");
		String name = kb.nextLine();
		System.out.println("Wow! " + name + "? What a stupid name!");

		System.out.println("How old are you, " + name + "?");
		int age = kb.nextInt();
		kb.nextLine();
		System.out.println("Woah, I could've sworn you were older than " + age + "!");

		System.out.println("What do you do for fun, " + name + "?");
		String activity = kb.nextLine();
		System.out.println(activity + "? What a lame thing to do for fun!");

		System.out.println("What kind of music do you like, " + name + "?");
		String music = kb.nextLine();
		System.out.println(music + "? I would never listen to that garbage!");

		System.out.println("How many siblings do you have, " + name + "?");
		int siblings = kb.nextInt();
		kb.nextLine();
		System.out.println("Whoah, " + siblings + "? No wonder you ended up like this.");

		System.out.println("What do you want to be when you grow up, " + name + "?");
		String job = kb.nextLine();
		System.out.println(job + "? Really? More like loser!");

		System.out.println("So " + name + ", you're " + age + "...");
		System.out.println("You like to " + activity + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + ". " + "I was only kidding.");
	}
}
