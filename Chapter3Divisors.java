
public class Chapter3Divisors
{
	
	public static void main(String[] args)
	{
		int divisor = 0;
		int number  = IBIO.inputInt("Enter a number: ");
		
		do
		{
			divisor++;
			if(number % divisor == 0)
			{	System.out.println( divisor );
			}
		} while( divisor != number );
		
	}
}

/*

Enter a number: 12
1
2
3
4
6
12

*/
