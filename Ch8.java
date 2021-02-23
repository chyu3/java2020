// Example to illustrate for loops + number combinations
public class Ch8
{
	
	public static void main (String[] args)
	{
		for(int i = 1; i <= 2; i++)
		{
			for(int j = 1; j <= 2; j++)
			{
				for(int k = 1; k <= 2; k++)
				{
					System.out.println(i + ", " + j + ", " + k);
				}
			}
		}
		System.out.println("\n\n");
		for(int i = 1; i <= 2; i++)
		{
			for(int j = i; j <= 2; j++)
			{
				for(int k = j; k <= 2; k++)
				{
					System.out.println(i + ", " + j + ", " + k);
				}
			}
		}
	}
}

