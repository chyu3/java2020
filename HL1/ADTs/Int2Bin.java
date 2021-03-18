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
		while(n > 0)
		{	s.push(n % 2);
			n = n / 2;
		}
		return s;
	}
	
	public static void printStack(Stack s)
	{
		Node temp = s.top;
		while(temp != null)
		{
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
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
		printStack(binary);

	}
}

