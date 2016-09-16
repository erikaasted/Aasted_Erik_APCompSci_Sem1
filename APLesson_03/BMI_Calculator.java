import java.util.Scanner;

public class BMI_Calculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your height in inches?");
		double height = kb.nextDouble();
		kb.nextLine();

		System.out.println("What is your weight in pounds?");
		double weight = kb.nextDouble();
		kb.nextLine();

		double bmi = (weight / (height * height) * 703);

		System.out.println("Your BMI is " + bmi);
	}
}