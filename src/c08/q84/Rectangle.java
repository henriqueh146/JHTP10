package c08.q84;

public class Rectangle
{
	
	private double length, width;

	Rectangle()
	{
		length = 1.0;
		width = 1.0;
	}

	public void setLength(double length)
	{
		if(length < 0.0 | width > 20.0) //As both of conditions need to be evaluated, it is necessary to use the one bar 'OR'
		{
			throw new IllegalArgumentException("Invalid value for length! It need to be greater than zero and "
			+ "lesser than 20");
		}

		this.length = length;
	}

	public double getLength()
	{
		return length;
	}

	public void setWidth(double width)
	{
		if(width < 0.0 | width > 20.0)
		{
			throw new IllegalArgumentException("Invalid value for width! It need to be greater than zero and"
			+ "lesser than 20.0");
		}

		this.width = width;
	}

	public double getWidth()
	{
		return width;
	}

	public double perimeter()
	{
		return length * 2 + width * 2;
	}

	public double area()
	{
		return length * width;
	}
}