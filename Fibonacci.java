public class Fibonacci
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Number of terms to calculate = ");
		int f = 0;
		int s = 1;
		int t = f + s;
		int counter = 2;
		
		IBIO.out(f + " " + s + " ");
		// while loop version
		while( counter <= n )
		{
			IBIO.out( t + " " );
			f = s;
			s = t;
			t = f + s;
			counter++;
		}
		
		IBIO.output("\n---------------------------\n");
		
		// for loop version
		f = 0; // zero-th and
		s = 1; // first terms of the Fibonacci sequence
		IBIO.out(f + " " + s + " ");
		for(int i = 2; i <= n; i++)
		{
			t = f + s;
			IBIO.out(t + " ");
			f = s;
			s = t;
		}
	}
}

