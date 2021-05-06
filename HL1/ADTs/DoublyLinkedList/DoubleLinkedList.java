public class DoubleLinkedList
{
	private DoubleNode beginning;
	

	public boolean isEmpty()
	{	return beginning == null;
	}

	public void append(char data)
	{
		DoubleNode newNode = new DoubleNode(data); // create a new node and initialise it with the given data
		DoubleNode current = beginning;
		if(isEmpty() == true)
		{	beginning = newNode;
		} else {
			while( current.getNext() != null ) // traverse to the end
			{	current = current.getNext();  // of the list
			}
			current.setNext(newNode); // add the new node to the end
			newNode.setPrevious(current);
		}
	}

	public boolean replace(char orig, char repl)
	{
		if( isEmpty() )
		{	System.out.println("List is empty!");
			return false;
		}
		boolean found = false;
		DoubleNode current = beginning;
		while(current != null)
		{	if(current.getData() == orig)
			{	current.setData(repl);
				found = true;
			}
			current = current.getNext();
		}
		return found;
	}

	public boolean remove(char delete)
	{
		if( isEmpty() )
		{	System.out.println("List is empty!");
			return false;
		}
		if( beginning.getData() == delete )		// delete first node in the list
		{	beginning = beginning.getNext();
			beginning.setPrevious(null);
			return true;
		} else {
			DoubleNode current = beginning.getNext();
			while(current.getNext() != null)
			{	if( current.getData() == delete )
				{	DoubleNode before = current.getPrevious();	// these two nodes are included
					DoubleNode after  = current.getNext();		// to make the code more readable
					after.setPrevious(before);	// before or current.getPrevious()
					before.setNext(after);		// after or current.getNext()
					return true;
				}
				current = current.getNext();
			}
			if(current.getData() == delete)		// delete last node in the list
			{	DoubleNode before = current.getPrevious();
				before.setNext(null);
				return true;
			}
		}
		return false;
	}

	public boolean insertBefore(char position, char newData)
	{
		if( isEmpty() )
		{	System.out.println("List is empty!");
			return false;
		}
		DoubleNode insert = new DoubleNode(newData);
		if( beginning.getData() == position )
		{	insert.setNext(beginning);
			beginning = insert;
			return true;
		}
		DoubleNode current = beginning.getNext();
		while(current != null)
		{	if(current.getData() == position)
			{	DoubleNode before = current.getPrevious();
				insert.setPrevious( before );
				insert.setNext( current );
				before.setNext( insert );
				current.setPrevious( insert );
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
	}

	public boolean insertAfter(char position, char newData)
	{
		if( isEmpty() )
		{	System.out.println("List is empty!");
			return false;
		}
		DoubleNode insert = new DoubleNode(newData);
		DoubleNode current = beginning;
		while(current != null)
		{	if(current.getData() == position)
			{	insert.setNext( current.getNext() );
				insert.setPrevious( current );
				current.setNext(insert);
				if(current.hasNext())
				{	DoubleNode following = current.getNext();
					following.setPrevious(insert);
				}
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
	}

	public String toString()
	{	// method that prints the contents of the queue
		// left to right, starting with
		// the head element at the leftmost position.
		if(isEmpty())
		{	return "<Empty list>";
		}
		String output = "BEGINNING";
		DoubleNode temp = beginning;
		while(temp != null)
		{	output += " <=> " + temp.getData();
			temp = temp.getNext();
		}
		return output + " -> NULL";
	}

}
