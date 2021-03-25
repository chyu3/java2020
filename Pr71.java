
public class Pr71
{
	
	public static void main(String[] args )
	{
		double xx = 1;
		for (int i = 0; i < 10; i++)
		{
			xx = xx * 3.732;
			int x = (int)(xx*100);
			//IBIO.output(xx);
			System.out.println( (double)x/100);
			System.out.printf( "\tprintf output: %,10.2f\n", xx);
		}
		
	}

}

/* original
3.732
13.927824000000001
51.97863916800001
193.98428137497604
723.9493380914106
2701.7789297571444
10083.038965853664
37629.901420565875
140434.79210155187
524102.6441229916



*/
