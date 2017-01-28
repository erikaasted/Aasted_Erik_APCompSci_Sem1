import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Paint color: ");
		String p = kb.nextLine();
		System.out.println("Enter Interior color: ");
		String i = kb.nextLine();
		System.out.println("Enter Engine type: ");
		String e = kb.nextLine();
		System.out.println("Enter Tire type: ");
		String t = kb.nextLine();

		Car car = new Car(p, i, e, t);

		System.out.printf("Your Vehicle Is Ready...%n");
		System.out.printf("Paint Color:       %10s%n", car.getPaint());
		System.out.printf("Interior Color:    %10s%n", car.getInterior());
		System.out.printf("Engine Type:       %10s%n", car.getEngine());
		System.out.printf("Tire Type:         %10s%n", car.getTires());
	}
}