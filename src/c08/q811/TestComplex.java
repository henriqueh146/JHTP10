package c08.q811;

public class TestComplex
{
	public static void main(String [] args)
	{
		Complex complex0 = new Complex();

		Complex complex1 = new Complex(2.0, 3.0);

		Complex complex2 = new Complex(-2.0, -3.0);

		Complex complex3 = new Complex(1.0, -2.0);


		System.out.println("Default values:");
		complex0.printComplex();

		System.out.println("Custom values (1.0, -2.0)");
		complex3.printComplex();

		System.out.printf("Test sum:%n%s + %s = %s", complex1, complex2, complex1.sum(complex2));

		System.out.printf("Test subtraction:%n%s + %s = %s", complex1, complex2, complex1.subtract(complex2));
	}
}