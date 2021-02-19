
public class Pr72
{

	// pad aligns N to the right with a given width
	static String align(double number, int width)
	{
		// use the indexOf method in this method (align)
		// as suggested in the worksheets
		String aligned = "" + number;
		while ( aligned.length() < width )
		{	aligned = " " + aligned;
		}
		return aligned;
	}
	
	// removes all decimals after the second one
	public static double truncate(double x)
	{
		int t = (int)(x*100);
		return (double)t/100;
	}
		
	public static void main(String[] args)
	{
		int w = 10;		// width for alignment=10 spaces
		double xx = 1;	// used to calculate output values
		for ( int i = 0 ; i < 10; i++)
		{
			//xx = truncate(xx * 3.732);
			xx = xx * 3.732;
			String s = align(xx, w);
			IBIO.output( s );
		}
	}

}

/*

         3.732
        13.927824000000001
        51.97863916800001
       193.98428137497604
       723.9493380914106
      2701.7789297571444
     10083.038965853664
     37629.901420565875
    140434.79210155187
    524102.6441229916

         3.73
        13.92
        51.94
       193.84
       723.41
      2699.76
     10075.5
     37601.76
    140329.76
    523710.66

*/
