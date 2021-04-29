/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
public class LListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList l = new LinkedList();
		int[] array = {5,1,4,7,9,1,6,3,2,0};
		
		for(int x : array)
		{
			l.append(x);
			l.printList();
		}
		l.remove(1); l.printList();
		l.remove(9); l.printList();
		l.remove(0); l.printList();
		
		System.out.println("\n\nSorted Linked List!\n");
		LinkedList sorted = new LinkedList();
		for(int x : array)
		{
			sorted.insertInOrder(x);
			sorted.printList();
		}
		
	}
}

