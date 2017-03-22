public class Honda implements Location
{
    private double[]location = new double[2];

    public Honda(double[] loc)
    {
        this.move(loc);
    }

    public int getID()
    {
        return (int)(Math.random()*999999 + 1);
    }

    public void move(double[] loc)
    {
        location[0] = loc[0];
        location[1] = loc[1];
    }

    public double[] getLoc()
    {
        return location;
    }
}
