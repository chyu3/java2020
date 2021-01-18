
public class StringDemo
{
	
	public static void main (String[] args)
	{
		/*
		String givenName = IBIO.input("Enter your given name: ");
		String surName = IBIO.input("Enter your surname: ");
		String name = surName.trim() + " " + givenName.trim();
		System.out.println("Hello " + name + ", how are you?");
		*/
		
		int x = 5;
		int y = x;
		System.out.println(x + " " + y);
		x++;
		System.out.println(x + " " + y);
		String s1 = "Joe";
		String s2 = "Joe";
		System.out.println(s1 + " " + s2);
		System.out.println(s1.hashCode()  + " " + s2.hashCode() );
		s1 = "JJ";
		System.out.println(s1 + " " + s2);
		System.out.println(s1.hashCode()  + " " + s2.hashCode() );
	}
}

