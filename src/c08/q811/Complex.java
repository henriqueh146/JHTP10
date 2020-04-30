package c08.q811;

public class Complex
{
	private double real;
	private double imaginary;

	public Complex()
	{

	}

	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal()
	{
		return real;
	}

	public double getImaginary()
	{
		return imaginary;
	}

	public Complex sum(Complex number)
	{
		return new Complex(this.real + number.getReal(), this.imaginary + number.getImaginary());
	}

	public Complex subtract(Complex number)
	{
		return new Complex(this.real - number.getReal(), this.imaginary - number.getImaginary());
	}

	public void printComplex()
	{
		System.out.printf("(%.2f, %.2f)%n", getReal(), getImaginary());
	}

	public String toString()
	{
		return String.format("%s %s %s", getReal() != 0? ""+getReal() :"", getImaginary() > 0? "+" : "", 
			getImaginary() != 0? ""+getImaginary()+"i":"");
	}
}