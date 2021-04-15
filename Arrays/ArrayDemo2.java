
public class ArrayDemo2
{
	private final static int MAXSIZE = 10;
	private static int lastIndex = 0;
	
	public static boolean isFull()
	{
		return lastIndex == MAXSIZE;
	/*	if (size == MAXSIZE)
	 *		return true;
	 *	else
	 *		return false;
	 */
	}
	
	public static void add(int[] a, int data)
	{
		if(isFull())
			System.out.println("Error - array full");
		else {
			a[lastIndex] = data;
			lastIndex++;
		}
	}
	
	public int search(int[] a, int data)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == data)
				return i;
		}
		return -1;
	}
	
	public static void remove(int[] a, int data)
	{
		int indexToRemove = search(a, data);
		if( indexToRemove != -1)
		{
			for(int i = indexToRemove; i < lastIndex; i++)
			{
				a[i-1] = a[i];
			}
		}
		lastIndex--;
	}	
	
	public static void main(String[] args)
	{
		int[] array = new int[MAXSIZE];
		System.out.println("HELLO");
		ArrayDemo.printArray(array);
		ArrayDemo.printArray(args);
	}
}

