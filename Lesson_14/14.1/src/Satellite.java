import java.util.ArrayList;
public class Satellite
{
    public static void main(String[]args)
    {
        ArrayList<Location> locate = new ArrayList<>();

        for (int i = 0; i <= 3; i++)
        {
            double one = (int) (Math.random() * 100 + 1);
            double two = (int) (Math.random() * 100 + 1);

            if (i == 1)
            {
                double[] honLoc = {one, two};
                locate.add(new Honda(honLoc));
            }

            if (i == 2)
            {
                String cords = "" + one + ", " + two;
                locate.add(new Toyota(cords));
            }

            if (i == 3)
            {
                locate.add(new GMC(one, two));
            }
        }


        double[] home = {0, 0};

        String printout = "\n\n" +
                "==========================" + "\nStarting locations...";

        for (int i = 0; i < locate.size(); i++)
        {
            printout += "\nLocation for " + locate.get(i).getID() + ": (" + getLocation(locate.get(i).getLoc()) + ")";
        }

        printout += "\n\n" + "==========================" + "\nDistance from home...";

        for (int i = 0; i < locate.size(); i++)
        {
            printout += "\nDistance for " + locate.get(i).getID() + ": (" + getDistance(locate.get(i).getLoc(), home) + ")";
        }

        System.out.println(printout);

    }


    public static double getDistance(double[] car, double[] home)
    {
        return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
    }


    public static String getLocation(double[] loc)
    {
        return loc[0] + ", " + loc[1];
    }
}

