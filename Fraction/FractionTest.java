import java.util.*;

public class FractionTest
{
    public static Fraction inputFraction()
    {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // Changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse the fraction
        int a = parse.nextInt(); // so we can extract the numerator
        int b = parse.nextInt(); // denominator
        if( b == 0 )
        {
            System.out.println("Cannot divide by 0");
            return null;
        }
        Fraction f = new Fraction(a, b);
        return f;
    }
    // psvm+tab
    public static void main(String[] args)
    {
        Fraction f = new Fraction(10, 20);
        System.out.println(f); // toString()
        System.out.println(f.toDecimal());
        Fraction g = new Fraction();
        System.out.println(g);
        g.setNum(12); g.setDen(36);
        System.out.println(g);
        g.cancel();
        System.out.println(g);
        Fraction h = inputFraction();
        System.out.println(h);
        System.out.println( g + " + " + h + " = " + g.add(h) );
        Fraction i = new Fraction(9, 36);
        System.out.println(g + ", " + i + " : ");
        System.out.println(g + " == " + i + " ?: " + g.equals(i));
        Fraction j = new Fraction(3, 9);
        System.out.println(g + " == " + j + " ?: " + g.equals(j));
        System.out.println(g + " compareTo " + j + " ?: " + g.compareTo(j));
        System.out.println(g + " compareTo " + i + " ?: " + g.compareTo(i));
        System.out.println(i + " compareTo " + h + " ?: " + i.compareTo(h));
    }
}

/* OUTPUT *

	1/2
	0.5
	0/1
	12/36
	1/3
	Enter fraction (a/b format): 5/8
	5/8
	1/3 + 5/8 = 23/24
	1/3, 1/4 : 
	1/3 == 1/4 ?: false
	1/3 == 1/3 ?: true
	1/3 compareTo 1/3 ?: 0.0
	1/3 compareTo 1/4 ?: 0.08333333333333331
	1/4 compareTo 5/8 ?: -0.375

*/
