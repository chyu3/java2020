public class DoubleLinkedListTest
{
	
	public static void main (String[] args)
	{
		DoubleLinkedList dllist = new DoubleLinkedList();
		char input;
		do
		{
			input = IBIO.inputChar("Enter a character, .=ends ");
			if(input != '.')
			{	dllist.append(input);
				System.out.println(dllist);
			}
		} while(input != '.');
		System.out.println(dllist);
		char ori = IBIO.inputChar("Enter a character to replace: ");
		char rep = IBIO.inputChar("Enter its replacement: ");
		dllist.replace(ori, rep);
		System.out.println(dllist);
		input = IBIO.inputChar("Enter a character to remove: ");
		System.out.println("Removed: " + dllist.remove(input));
		System.out.println(dllist);
		char position = IBIO.inputChar("Enter a character to find: ");
		input = IBIO.inputChar("Enter the character to insert BEFORE " + position + ": ");
		dllist.insertBefore(position, input);
		System.out.println(dllist);
		position = IBIO.inputChar("Enter a character to find: ");
		input = IBIO.inputChar("Enter the character to insert AFTER " + position + ": ");
		dllist.insertAfter(position, input);
		System.out.println(dllist);
	}
}

