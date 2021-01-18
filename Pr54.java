
public class Pr54 
{
	
	public static void main (String[] args)
	{
		double sum = 0;
		double num = 1.0;
		double den = 1.0;
		double inc = 1.0;
		double term = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			term = num / den;
			sum = sum + term;
			
			inc = inc + 2;
			num = num * i;
			den = den * inc;
		}
		System.out.println( "Pi is " + (sum * 2) );
		System.out.println( "Pi is " + 3.1415926535897922);
	}
}

