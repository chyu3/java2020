/*
 * Int2Bin
 * 
 * Convert integer to binary,
 * the SL (iterative/loops) and HL (recursive) ways
 * 
 */


public class Int2Bin
{
	// converts an integer and returns its binary
	// equivalent as a String -- SL algorithm
	public static String int2binSL(int number)
	{
		String bin = "";
		int n = number;
		while(n > 0)
		{	bin = (n % 2) + bin;
			n = n / 2;
		}
		return bin;
	}
	
	public static void int2binHL(int n)
	{
		if(n == 0) // recommended base case
		{	return;
		}
		int2binHL(n / 2);
		System.out.print(n % 2);
	}
	
	public static Stack int2binStack(int number)
	{
		Stack s = new Stack(); // create an empty stack
		int n = number;
		// your code goes here. Take ideas from int2binSL,
		// just think about replacing what is done using
		// a string with a stack
		return s;
	}
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("Enter a positive integer: ");
		x = Math.abs(x);
		System.out.printf( "%d is %s in binary (SL algorithm)\n", x, int2binSL(x) );
		System.out.print( x + " is ");
		int2binHL(x);
		System.out.println( " in binary (HL algorithm)");
		Stack binary = int2binStack(x);
		// now output the stack so that we get the binary
		// equivalent of the integer input
		/* HL challenge:
		 * write a method, called int2binS, that uses a stack
		 * in order to calculate the binary equivalent of an
		 * integer. Test it in the main method as well.
		 * The idea is to use a stack (instead of recursion),
		 * to reverse the modulos of 2 and build the binary
		 */
	}
}

