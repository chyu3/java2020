
public class Decimals
{
	
	public static void main (String[] args)
	{
		double x = IBIO.inputDouble("Enter a decimal: ");
		double pi = Math.PI;
		System.out.println(x);
		System.out.println(pi);
		System.out.println(x);
		System.out.printf("%.3f\n", pi);
		System.out.printf("%.3f\n", x);
		int z = (int)(x*1000);
		System.out.println(z);
		x = z / 1000.0;
		System.out.println(x);
		System.out.println( (int)(pi*1000) / 1000.0 );
	}
}

