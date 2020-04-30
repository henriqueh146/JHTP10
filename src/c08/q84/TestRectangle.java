package c08.q84;

public class TestRectangle
{
	
	public static void main(String [] args)
	{
		Rectangle rect = new Rectangle();

		System.out.printf("Default values: length = %.2f, width = %.2f.%n", rect.getLength(), rect.getWidth());

		System.out.println("Setting length for 4.0 and width for 2.0");
		rect.setLength(4.0);
		rect.setWidth(2.0);
		System.out.printf("New values:%nLength = %.2f%nWidth = %.2f%n", rect.getLength(), rect.getWidth());

		System.out.printf("Perimeter = %.2f%nArea = %.2f%n", rect.perimeter(), rect.area());

		System.out.println("Testing invalid values for length and width (length = -1.0, width = 25.0)");

		rect.setLength(-1.0);
		rect.setWidth(25.0);

		System.out.printf("Checking the values:%nLength = %.2f%nWidth = %.2f%n", rect.getLength(), rect.getWidth());
	}
}