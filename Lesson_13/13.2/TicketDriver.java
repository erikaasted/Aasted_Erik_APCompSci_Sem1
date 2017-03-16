public class TicketDriver
{
    public static void main(String[]args)
    {
        Ticket one = new WalkUp();
        Ticket two = new Advance(30);
        Ticket three = new StudentAdvance(5);


        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
