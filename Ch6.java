
public class Ch6
{
	public static String spaces(int n)
	{	String spaces = "";
		for (int i = 0; i < n; i++)
			spaces = spaces + " ";
		return spaces;
	}	
	
	public static String stars(int n, int s)
	{	String stars = spaces(s);
		for (int i = 0; i < n; i++)
			stars = stars + "*";
		return stars;
	}
	
	public static void main(String[] args)
	{	
		int num = IBIO.inputInt("enter number of lines ");
		int spc = IBIO.inputInt("enter number of spaces ");
		String aa = stars(num, spc);
		for (int i = 0; i < num; i++)
			IBIO.output(aa);
		/* without methods	
		for (int i = 0; i < num; i++)
		{	for (int j = 0; j < num; j++)
			{	IBIO.out("*");
			}
			IBIO.output("");
		}
		*/
	}
}

/*
enter number of lines 5
enter number of spaces 2
  *****
  *****
  *****
  *****
  *****
   
  
 */ 
