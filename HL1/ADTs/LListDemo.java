/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
public class LListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList l = new LinkedList();
		int[] array = {1,3,5,7,9,1,6,4,2,0};
		for(int x : array)
		{
			l.append(x);
			l.printList();
		}
		l.remove(1); l.printList();
		l.remove(9); l.printList();
		l.remove(0); l.printList();
	}
}

