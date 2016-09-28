import java.util.Scanner;

public class Boxes
{
	public static void main(String[]args)
	{
		Boxes volume = new Boxes();
		Scanner kb = new Scanner(System.in);

		System.out.println("What is the length in inches?");
		double length = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is the width in inches?");
		double width = kb.nextDouble();
		kb.nextLine();
		System.out.println("What is the height in inches?");
		double height = kb.nextDouble();
		kb.nextLine();

		System.out.println("The volume in cubic feet is " + volume.calcVol(length, width, height));
		
	}

	public double calcVol(double l, double w, double h)
	{
		return ((l * w * h) / 1728);
	}
}



//main() method
//Create new objects
//Take user input for height, length, and width. 
//Use calcVol to get volume
//Print results
//calcVol() method
//Calculate the volume from the measurements
//takes in height, length, and width measurements in inches, calculates the volume, and converts to cubic feet.