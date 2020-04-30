/*

if (y == 8)
if (x == 5)
System.out.println("@@@@@");
else
System.out.println("#####");
System.out.println("$$$$$");
System.out.println("&&&&&");

*/
public class Questao428
{
	public static void main(String [] args)
	{
		// a)
		int x = 5;
		int y = 8;
		System.out.printf("a)%nx= 5 e y = 8%n");
		if (y == 8)
		{
			if (x == 5)
				System.out.println("@@@@@");
		}
		else
		{
			System.out.println("#####");
		}
		System.out.println("$$$$$");
		System.out.println("&&&&&");

		// b)
		System.out.printf("%n%nb)%nx= 5 e y = 8%n");
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}

		// d)
		y = 7;
		System.out.printf("%n%nd)%nx= 5 e y = 7%n");
		if (y == 8)
		{
			if (x == 5)
			System.out.println("@@@@@");
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
	}
}