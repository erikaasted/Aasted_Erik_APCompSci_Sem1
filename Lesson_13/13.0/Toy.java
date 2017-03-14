public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy(String n)
	{
		this.name = n;
		this.count = 1; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + " " + count;
	}
}