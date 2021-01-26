public class Pr62
{
	
	public static String stars(int n)
	{	String stars = "";
		for (int i = 0; i < n; i++)
			stars = stars + "*";
		return stars;
	}
	
	public static void main(String[] args)
	{	
		int num = IBIO.inputInt("enter number of lines ");
	
		for (int i = 1; i <= num; i++)
		{	IBIO.output(stars(i));
		}
	}
}

/*

enter number of lines 6
*
**
***
****
*****
******
   
  
*/ 
