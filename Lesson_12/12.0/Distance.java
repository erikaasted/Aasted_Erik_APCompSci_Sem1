import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}

	public Distance(int oneX, int oneY, int twoX, int twoY)
	{
		xOne = oneX;
		yOne = oneY;
		xTwo = twoX;
		yTwo = twoY;
		distance = 0;
	}

	public void setValues(int oneX, int oneY, int twoX, int twoY)
	{
		xOne = oneX;
		yOne = oneY;
		xTwo = twoX;
		yTwo = twoY;
		distance = 0;
	}

	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	} 
}