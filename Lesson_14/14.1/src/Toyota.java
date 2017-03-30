public class Toyota extends Car
{
    public Toyota (String coordinates)
    {
        String[] cords = coordinates.split(", ");
        super.move(Double.parseDouble(cords[0]), Double.parseDouble(cords[1]));
    }
}