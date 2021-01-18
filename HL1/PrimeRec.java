
public class PrimeRec
{
	public static boolean isPrime(int n, int i)
	{
		if(n == i)
		{	return true;
		}
		
		if(n % i == 0)
		{	return false;
		}

		return isPrime(n, i + 1);
	}
	
	public static void main (String[] args)
	{
		System.out.println( isPrime(17, 2) );
		System.out.println( isPrime(15, 2) );
	}
}

