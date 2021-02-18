
public class Node
{
	int data;
	Node next; // (self-reference)
	
	public Node(int d)
	{
		data = d;
		next = null;
	}
	
	public boolean hasNext()
	{
		if(next == null)
			return false;
		else
			return true;
			
		// OR // return next != null;
	}

}

