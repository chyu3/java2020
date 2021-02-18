/*
 * StackDemo v1
 * 
 */
import java.util.*;

public class StackDemo
{
	
	public static void main (String[] args)
	{
		Stack<String> stack = new Stack<>();
		String input;
		do
		{
			input = IBIO.input("Enter a name to push to the stack: ");
			if(input.length() > 0)
			{	stack.push(input);
			}
			System.out.println(stack);
		} while(input.length() > 0);
		
		
	}
}

