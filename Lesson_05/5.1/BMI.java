import java.util.Scanner;

public class BMI
{
	static double height, weight, bmi;
	static String condition;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your height in inches?");
		height = kb.nextDouble();

		System.out.println("What is your weight in pounds?");
		weight = kb.nextDouble();

		calcBMI();

		System.out.printf("Your BMI value is %3.1f and your status is %s.\n", bmi, condition);
	}

	public static void calcBMI()
	{
		bmi = (weight * 703) / (height * height);

		if (bmi <= 18.5)
			condition = "underweight";
		else if (bmi < 25)
			condition = "normal";
		else if (bmi < 30)
			condition = "overweight";
		else if (bmi < 35)
			condition = "obese";
		else if (bmi < 40)
			condition = "very obese";
		else if (bmi > 40)
			condition = "morbidly obese";
	}
}
