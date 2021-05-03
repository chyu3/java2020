/*
 * Node (element) class: building block of ADTs,
 * specifically for linked (list) implementations
 */
 
public class StringNode
{
	String data;
	StringNode next; // (self-reference)
	
	public StringNode(String d)	// constructor <- allows you to create
	{						// a node AND initialise its data at
		data = d;			// the same time (with one line of code).
		next = null;		// like: Node n = new Node(5);
	}
	
	public boolean hasNext()
	{
		if(next == null)
			return false;
		else
			return true;
			
		// OR // return next != null;
	}

	// not important at this point in time. Provides a String representation of the Node.
	public String toString()
	{
		return data;
	}


}

