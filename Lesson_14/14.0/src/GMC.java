public class GMC implements Location
{
    private double x, y;

    public GMC(double xCord, double yCord)
    {
        this.move(xCord, yCord);
    }

    public int getID()
    {
        return (int)(Math.random()*999999 + 1);
    }

    public void move(double xCord, double yCord)
    {
        x = xCord;
        y = yCord;
    }

    public double[] getLoc()
    {
        return new double[]{x, y};
    }
}
