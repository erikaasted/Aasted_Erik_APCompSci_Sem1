public class Toyota implements Location
{
    private double[]location = new double[2];

    public Toyota (String coordinates)
    {
        String[] cords = new String[2];
        cords = coordinates.split(", ");
        this.move(cords[0], cords[1]);
    }

    public int getID()
    {
        return (int)(Math.random() * 999999 + 1);
    }

    public void move(String xCord, String yCord)
    {
        location[0] = Double.parseDouble(xCord);
        location[1] = Double.parseDouble(yCord);
    }

    public double[] getLoc()
    {
        return location;
    }
}
