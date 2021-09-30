
public class MockP2ten
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos");
		int min=0, max=0, freq=0, numbers = 0;
		double sum = 0;
		int n;
		do
		{
			n = IBIO.inputInt("Enter a number: ");
			if(n > 0)
			{	numbers++;
				
				int divisor = 1;
				do
				{	divisor++;
				} while(n % divisor != 0);
				if(n == divisor)
					freq++;
					
				sum = sum + n;
				if(numbers == 1)
				{	min = n;
					max = n;
				} else
				{	if(n < min)
						min = n;
					if(n > max)
						max = n;
				}
			}
		} while(n > 0);
		IBIO.output("Minimum = " + min);
		IBIO.output("Maximum = " + max);
		IBIO.output("Average = " + sum/numbers);
		IBIO.output("Prime frequency = " + freq);
	}
}

