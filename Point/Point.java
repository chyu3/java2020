
public class Point
{	// Attributes + Beaviours = encapsulation
	// private fields = data hiding
	// Attributes or fields
	private char name;
	private double x;
	private double y;
	
	// behaviours or actions
	public Point(char name, double x, double y) //constructor
	{	// instantiates and initialises the object - called by the NEW keyword
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	// acessor method - getter
	public char getName()
	{
		return this.name;
	}
	
	// mutator method - setter	
	public void setName(char name)
	{
		this.name = name;
	}
	
	public void print()
	{
		System.out.print(name+"("+x+","+y+")");
	}
	
	
	
	
}

