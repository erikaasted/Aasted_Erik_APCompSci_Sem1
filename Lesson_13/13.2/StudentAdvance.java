public class StudentAdvance extends Advance
{
    public StudentAdvance(int dL)
    {
        super.modifyDaysLeft(dL);
    }

    public int getPrice()
    {
        return (super.getPrice() / 2);
    }

    public String toString()
    {
        return "\nSerial#: " + super.getSerialNo() + "\nPrice: $" + getPrice() + "\nSTUDENT ID REQUIRED";
    }
}
