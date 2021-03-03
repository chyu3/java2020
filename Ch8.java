// Example to illustrate for loops + number combinations
public class Ch8
{
	
	public static void main (String[] args)
	{
		int max = 3;
		int counter = 0;
		for(int i = 1; i <= max; i++)
		{
			for(int j = 1; j <= max; j++)
			{
				for(int k = 1; k <= max; k++)
				{
					System.out.println(i + ", " + j + ", " + k);
					counter++;
				}
			}
		}
		System.out.println(counter + "\n\n");
		counter = 0;
		for(int i = 1; i <= max; i++)
		{
			for(int j = i; j <= max; j++)
			{
				for(int k = j; k <= max; k++)
				{
					System.out.println(i + ", " + j + ", " + k);
					counter++;
				}
			}
		}
		System.out.println(counter + "\n\n");
	}
}

