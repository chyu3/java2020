
public class ArrayDemo
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
		System.out.println();
	}
	
	public static void printArrayReverse(int[] a)
	{
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print( a[i] + " " );
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		int[] array = { 1,3,5,7,9,11 };
		int[] b = array; //{ 1,2,3,4,5,6,7 };
		int[] c = new int[array.length];
		System.out.println(array);
		System.out.println(b);
		printArray(array);
		System.out.println(array[0]); // first element
		int lastIndex = array.length-1;
		System.out.println(array[lastIndex]); // last element
		printArrayReverse( array );
		b[b.length-1] = 13;
		System.out.println("\nArray b's last element set to 13");
		System.out.println("\nPrinting arrays array and b");
		printArray( array );
		printArray( b );
		
	}
}

