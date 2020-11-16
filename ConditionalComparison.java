
public class ConditionalComparison
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter the number to be processed = ");
		
		IBIO.output(">>> Check for +, - or 0");
		if(n > 0)
		{	IBIO.output("Positive");
			IBIO.output(">>> Check for <10");
			if(n < 10)
				IBIO.output("Less than 10");
		}
		else if(n < 0)
			IBIO.output("Negative");
		else
			IBIO.output("Zero");
		
		IBIO.output(">>> Check even or odd");
		if(n % 2 == 0)
			IBIO.output("Even");
		else
			IBIO.output("Odd");
		
		IBIO.output("\n----------------------------------------\n");
		
		IBIO.output(">>> Check for +");
		if(n > 0)
			IBIO.output("Positive");
		IBIO.output(">>> Check for <10");
		if(n < 10)
			IBIO.output("Less than 10");
		IBIO.output(">>> Check for -");
		if(n < 0)
			IBIO.output("Negative");
		IBIO.output(">>> Check for 0");
		if(n == 0)
			IBIO.output("Zero");
		IBIO.output(">>> Check even or odd");
		if(n % 2 == 0)
			IBIO.output("Even");
		else
			IBIO.output("Odd");
	}
}

