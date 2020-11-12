
public class ValidationWhile
{
	
	public static void main (String[] args)
	{
		// while loop validation
		int a = IBIO.inputInt("Enter a number: ");
		while(a < 5)
		{
			// this line runs only if a IS < 5
			a = IBIO.inputInt("ERROR-enter a number < 5: ");
		}
		
		int b = 0;
		do
		{	// this code runs AT LEAST ONCE
			b = IBIO.inputInt("Enter a number: ");
			if(b < 5)
				IBIO.output("ERROR-enter a number < 5");
		} while(b < 5);
		
		int min=0, max=0, freq=0;
		double sum=0;
		for(int i = 0; i < b; i++)
		{
			int n = IBIO.inputInt("Enter a number: ");
			if(i==0)
			{	min=n;
				max=n;
			}
			sum = sum + n;
		}
			
			
	}
}

