import java.util.Scanner;

public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("*signify a weighted class with a lowercase w following the inputted letter grade*");
		System.out.println("...");

		System.out.println("What was your letter grade in first period?");
		String grade1 = kb.nextLine();
		System.out.println("What was your letter grade in second period?");
		String grade2 = kb.nextLine();
		System.out.println("What was your letter grade in third period?");
		String grade3 = kb.nextLine();
		System.out.println("What was your letter grade in fourth period?");
		String grade4 = kb.nextLine();
		System.out.println("What was your letter grade in fifth period?");
		String grade5 = kb.nextLine();
		System.out.println("What was your letter grade in sixth period?");
		String grade6 = kb.nextLine();
		System.out.println("What was your letter grade in seventh period?");
		String grade7 = kb.nextLine();

		double points1 = calcPoints(grade1);
		double points2 = calcPoints(grade2);
		double points3 = calcPoints(grade3);
		double points4 = calcPoints(grade4);
		double points5 = calcPoints(grade5);
		double points6 = calcPoints(grade6);
		double points7 = calcPoints(grade7);

		double gpa = ((points1 + points2 + points3 + points4 + points5 + points6 + points7) / 7);
		System.out.printf("Your grade point average is %3.2f", gpa);
	}

	public static double calcPoints(String grade)
	{
		//capitals
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("Aw"))
			return 5.0;
		if (grade.equals("Bw"))
			return 4.0;
		if (grade.equals("Cw"))
			return 3.0;
		if (grade.equals("Dw"))
			return 2.0;
		//lowercase
		if (grade.equals("a"))
			return 4.0;
		if (grade.equals("b"))
			return 3.0;
		if (grade.equals("c"))
			return 2.0;
		if (grade.equals("d"))
			return 1.0;
		if (grade.equals("aw"))
			return 5.0;
		if (grade.equals("bw"))
			return 4.0;
		if (grade.equals("cw"))
			return 3.0;
		if (grade.equals("dw"))
			return 2.0;
		//F grade or invalid input
		return 0;
	}
}
