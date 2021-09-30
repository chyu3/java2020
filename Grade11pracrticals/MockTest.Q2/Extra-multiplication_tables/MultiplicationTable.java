public class MultiplicationTable
{
	
	public static void main (String[] args)
	{
		IBIO.output("Name");
		while(true)
		{
			int n = IBIO.inputInt("Enter a number between 1 and 9: ");
			while(n < 0 || n > 9)
			{
				n = IBIO.inputInt("Error-number must be between 1 and 9: ");
			}
			if(n == 0)
			{
				System.exit(0);
			}
			for(int h = 1; h <= n; h++)
			{
				for(int i = 1; i <= 20; i++)
				{
					int product = h * i;
					IBIO.out(h + " x ");
					if(i < 10) IBIO.out(" ");
					IBIO.out(i + " = ");
					if(product < 10) IBIO.out(" ");
					if(product < 100) IBIO.out(" ");
					IBIO.output(product);
				}
				IBIO.output("------------");
			}
		}
	}
}

