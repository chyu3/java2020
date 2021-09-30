
public class MockP2
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos");
		
		int number = IBIO.inputInt("How many numbers to process? ");
		while(number < 5)
		{
			number = IBIO.inputInt("ERROR-Enter a number < 5: ");
		}
		/* alternatively (does basically the same thing):
		int number;
		do
		{
			number = IBIO.inputInt("Enter a number: "):
		} while(number < 5);
		*/
		int min=0, max=0, freq=0;
		double sum = 0;
		for(int i = 0; i < number; i++)
		{
			int n = IBIO.inputInt("Enter a number: ");
			// use first number as baseline
			if(i == 0)
			{	min = n;
				max = n;
			} else
			{	if(n < min)
					min = n;
				if(n > max)
					max = n;
			}
			// check if prime or not
			int divisor = 1;
			do
			{	divisor++;
			} while(n % divisor != 0);
			// if it is prime, count it
			if(n == divisor)
				freq++;
				
			sum = sum + n;

			
		}
		IBIO.output("Minimum = " + min);
		IBIO.output("Maximum = " + max);
		
		IBIO.output("Average = " + sum/number);
		IBIO.output("Prime frequency = " + freq);
	}
}

