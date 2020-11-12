import java.util.Scanner;
import static java.lang.System.out;

public class RecCircleTest
{
	static final double scaleX = 100;
	static final double scaleY = 100;
	static final double middleX = scaleX / 2;
	static final double middleY = scaleY / 2;
	
    /* From StdDraw, you will use:
     * StdDraw.circle(x,y,r);
     *  which draws a circle of radius r, centered on (x, y).
     * @param x the x-coordinate of the centre of the circle
     * @param y the y-coordinate of the centre of the circle
     * @param r the radius of the circle
     * @throws IllegalArgumentException if the radius of the circle is negative
     */
	
	/* Part 1: finish this recursive method that will draw
	 * concentric circles using recursion and StdDraw.circle(x,y,r);
	 * the circles shoud be drawn from largest to smallest radius
	 */
	public static void circlere(double radius)	// expanding circle [3 marks]
	{
		// YOUR MASTERPIECE CODE GOES HERE!
		
	}

	/* Part 2: finish this recursive method that will draw
	 * concentric circles using recursion and StdDraw.circle(x,y,r);
	 * the circles shoud be drawn from smallest to largest radius
	 */
	public static void circlers(double minRadius, double maxRadius)	// shrinking circle [3 marks]
	{
		// YOUR MASTERPIECE CODE GOES HERE!
		
	}

	public static void main(String[] args)
	{
		StdDraw.setXscale(0, scaleX);
		StdDraw.setYscale(0, scaleY);
		double maxRadius = 0;
		
		if( scaleX == scaleY )
		{	maxRadius = scaleX;
		}
		else if( scaleX > scaleY )
		{	maxRadius = scaleX / 2;
		}
		else
		{	maxRadius = scaleY / 2;
		}	
		out.print("Enter a radius (1-" + maxRadius + "): ");
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		in.close();

		// Expanding/growing concentric circles (comment/uncomment to test)
		StdDraw.setPenColor(StdDraw.BLUE);
		circlere( r );

		// Shrinking concentric circles (comment/uncomment to test)
		//StdDraw.setPenColor(StdDraw.MAGENTA);
		//circlers( 1, r );

	}
	
}
