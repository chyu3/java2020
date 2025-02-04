// class to test / use the Point class
public class PointTest
{
	
	public static void main (String[] args)
	{//	declaration|instantiation
		Point a	=   new Point('A', 2, 3); // instantiating an object of the Point class
	/*	a.name = 'A';	// here we initialise the attributes/fields of...
		a.x = 1.5;		// the object _a_
		a.y = 0;
		a.print();		// the object _a_ performs the print action/
						// AKA "prints itself"
	*/
		System.out.println(a);
		// we can create as many Point objects as we want...
		Point b = new Point('B', 2, 3); // instantiating another object
	/*	b.name = 'B';
		b.x = 2;
		b.y = 3;
		b.print();
	*/	System.out.print("Point name: " + b.getName());
		System.out.print(" getX() = " + b.getX());
		System.out.println(" getY() = " + b.getY());
		// How would you create an array of Points? :)
		Point c = new Point();
		c.setName('C'); c.setX(-3); c.setY(-1);
//		c.print();
		System.out.println("\n"+c);
		Point d = new Point('D', 10, 7);
		System.out.println(d);
		// compare the following output before and after
		// 
		System.out.println(a.getName() + " == " + b.getName() + "? " + a.equals(b));
		System.out.println(b.getName() + " == " + c.getName() + "? " + b.equals(c));
		System.out.println(b.getName() + " == " + d.getName() + "? " + b.equals(d));
		System.out.println( "Distance between " + a.getName() + " and " + c.getName() + "? " + a.distance(c) );
		System.out.println( "Distance between " + c.getName() + " and " + d.getName() + "? " + c.distance(d) );
		System.out.println("a.compareTo(b) = " + a.compareTo(b));
		System.out.println("b.compareTo(d) = " + b.compareTo(d));
		
	}
}

