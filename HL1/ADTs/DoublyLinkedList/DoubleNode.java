/* Class that defines the conents (attributes) and behaviours (methods)
 * of a NODE for doubly-linked ADTs.
 */
public class DoubleNode
{
	DoubleNode previous;
	char data;
	DoubleNode next;

	public DoubleNode(char c)	// constructor: method that
	{	previous = null;// creates/instantiates and initialises a node
		data = c;		// called by using the "NEW" Java keyword
		next = null;
	}

	public boolean hasPrevious()
	{	return previous != null;
	}
	
	public boolean hasNext()
	{	return next != null;
	}

	public char getData()
	{	return data;
	}

	public void setData(char c)
	{	data = c;
	}

	public DoubleNode getPrevious()
	{	return previous;
	}

	public void setPrevious(DoubleNode n)
	{	previous = n;
	}

	public DoubleNode getNext()
	{	return next;
	}

	public void setNext(DoubleNode n)
	{	next = n;
	}

	public String toString()
	{	return "" + data;
	}

}
