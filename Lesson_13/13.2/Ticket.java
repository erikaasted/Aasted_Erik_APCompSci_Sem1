public abstract class Ticket
{
    private int serialNo;

    public Ticket()
    {
        serialNo = ((int) (Math.random() * 9999999) + 1);
    }

    public int getSerialNo()
    {
        return serialNo;
    }

    public abstract int getPrice();

    public String toString()
    {
        return "\nSerial#: " + serialNo + "\nPrice: $" + getPrice();
    }
}
