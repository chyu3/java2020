
public class Ch7
{
	
public static void main(String[] args)
{
	for ( int i = 1 ; i < 20; i++)
	{
		String s = pad(i, 10) + pad(i*i, 10) + pad(i*i*i, 10);
		IBIO.output( s );
	}
}

	static String pad(int n, int tab)
	{
		String st = "" + n;
		while ( st .length() < tab )
			st = " " + st;
		return st;
	}
}

/*
         1         1         1
         2         4         8
         3         9        27
         4        16        64
         5        25       125
         6        36       216
         7        49       343
         8        64       512
         9        81       729
        10       100      1000
        11       121      1331
        12       144      1728
        13       169      2197
        14       196      2744
        15       225      3375
        16       256      4096
        17       289      4913
        18       324      5832
        19       361      6859
*/
