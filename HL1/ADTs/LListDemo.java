/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
public class LListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList l = new LinkedList();
		int[] array = {1,3,5,7,9,11,0};
		for(int x : array)
		{
			l.append(x);
			l.printList();
		}
		
	}
}

