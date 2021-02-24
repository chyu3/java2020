/*
 * StackDemo v1
 * 
 */


public class StackDemo
{
	
	public static void main (String[] args)
	{
		Stack stack = new Stack();
		int input;
		do
		{
			input = IBIO.inputInt("Enter a number to push to the stack: ");
			if(input > 0)
			{	stack.push(input);
			}
			stack.printStack();
		} while(input > 0);
	}
}

