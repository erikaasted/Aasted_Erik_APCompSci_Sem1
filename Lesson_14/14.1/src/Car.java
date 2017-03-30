public abstract class Car implements Location
{
    private double[] location;
    public final int id = (int)(Math.random() * 999999 + 1);

    public Car()
    {
        location = new double[2];
    }

    public int getID()
    {
        return id;
    }

    public void move(double x, double y)
    {
        location[0] = x;
        location[1] = y;
    }

    public double[] getLoc()
    {
        return location;
    }
}