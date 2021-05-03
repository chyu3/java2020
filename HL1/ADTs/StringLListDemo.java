/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
public class StringLListDemo
{
	
	public static void main (String[] args)
	{
		StringLinkedList l = new StringLinkedList();
		String[] inputData = {"Faye", "Bob", "Eli" , "Horacio", "Iggy", "Ben", "Gwen", "Daniel", "Cole", "Anne"};
		System.out.println("Adding data to a linked list:");
		printArray(inputData);
		System.out.println();
		for(String x : inputData)
		{
			l.append(x);
			l.printList();
		}
		System.out.println("\nRemoving Ben from the linked list:");
		l.remove("Ben"); l.printList();
		System.out.println("\nRemoving anne from the linked list:");
		l.remove("anne"); l.printList();
		System.out.println("\nRemoving Faye from the linked list:");
		l.remove("Faye"); l.printList();
		
		System.out.println("\n\nSorted Linked List!\nInput data:");
		printArray(inputData);
		StringLinkedList sorted = new StringLinkedList();
		for(String x : inputData)
		{
			sorted.insertInOrder(x);
			sorted.printList();
		}
		
	}
	
	public static void printArray(String[] a)
	{
		System.out.print( "Array contents -->");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print( "  " + a[i]);
		}
		System.out.printf("\t: %d elements in array\n", a.length);
	}
}

