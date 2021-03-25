
public class ArrayDemo2
{
	private final static int MAXSIZE = 10;
	private static size = 0;
	
	public static boolean isFull()
	{
		return size == MAXSIZE;
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
			a[size] = data;
			size++;
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[MAXSIZE];
		System.out.println("Thieves liket them.");
		ArrayDemo.printArray(array);
		ArrayDemo.printArray(args);
	}
}

