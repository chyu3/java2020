
public class ReverseStringHL
{
	public static void reverse(String str)
	{
		if(str == null || str.equals(""))
		{	return;
		}
		System.out.print(str.charAt(str.length()-1));
		reverse(str.substring(0, str.length()-1));
	}
		
	public static void main (String[] args)
	{
		String s = "Computer Science";
		System.out.println("\n" + s);
		reverse(s);
		
	}
}

