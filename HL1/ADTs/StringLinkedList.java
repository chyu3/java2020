/*
 * StringLinkedList.java
 * 
 * Requires: StringStringNode.java
 * 
 * 
 */


public class StringLinkedList
{
	StringNode start;		// beginning/head/access point of the L. List
	
	public boolean isEmpty()
	{	return start == null;
	}
	
	public void append(String data)
	{	StringNode newStringNode = new StringNode(data);
		if( isEmpty() )
		{	start = newStringNode;
			return;
		}
		StringNode temp = start;
		// also while( temp.hasNext() )
		while( temp.next != null )
		{	temp = temp.next;
		}
		temp.next = newStringNode;
	}
	
	public void printList()
	{	
		if( isEmpty() )
		{	System.out.println("List is empty");
			return;
		}
		StringNode temp = start;
		System.out.print("Start -> ");
		while(temp != null)
		{	System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(); //" <- End");
	}
	
	public void remove(String element)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return;
		}
		if( element.equalsIgnoreCase(start.data) )
		{	start = start.next;
			return;
		}
		StringNode temp1 = start;
		StringNode temp2 = start.next;
		while(temp2 != null)
		{	if(temp2.data.equalsIgnoreCase(element) )
			{	temp1.next = temp2.next;
				return; // removing this does something!
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}
	
	public void insertInOrder(String data)
	{	
		StringNode newStringNode = new StringNode(data);
		if( isEmpty() || data.compareToIgnoreCase(start.data) < 0 )
		{	newStringNode.next = start;
			start = newStringNode;
		} else {
			StringNode previous = start;
			StringNode current  = start.next;
			while(current != null && 
					current.data.compareToIgnoreCase(newStringNode.data) < 0)
			{	previous = previous.next;
				current  = current.next;
			}
			newStringNode.next = current;
			previous.next = newStringNode;
		}
	}
	
}

