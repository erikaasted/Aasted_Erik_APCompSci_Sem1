import java.*;
import java.util.Scanner;

public class Interest
{
	public static void main(String[]args)
	{
		Interest payment = new Interest();
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your interest rate?");
		double interest = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is your principal?");
		double principal = kb.nextDouble();
		kb.nextLine();
		System.out.println("How many times a year is your loan compounded?");
		double compounded = kb.nextDouble();
		kb.nextLine();
		System.out.println("How long does your loan run in years?");
		double life = kb.nextDouble();
		kb.nextLine();

		double total = 0;

		System.out.println("Your total monthly payment is $" + payment.paymentcalc(interest, principal, compounded, life, total));
	}

	public double paymentcalc(double inter, double princ, double comp, double lif, double tot)
	{
		tot = (princ*(Math.pow (1+(inter/comp),comp*lif)));
		return (tot/(lif*12));
	}

}
