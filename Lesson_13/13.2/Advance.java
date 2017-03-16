public class Advance extends Ticket
{
    private int daysLeft;

    public Advance()
    {
        daysLeft = 0;
    }

    public Advance(int dL)
    {
        daysLeft = dL;
    }

    public void modifyDaysLeft(int dL)
    {
        daysLeft = dL;
    }


    public int getPrice()
    {
        if (daysLeft >= 10)
        {
            return 30;
        }
        else
        {
            return 40;
        }
    }
}
