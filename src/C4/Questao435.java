import java.util.Scanner;

public class Questao435
{
	public static void main(String [] args)
	{
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor (maior que zero)");
		a = input.nextInt();
		System.out.println("Digite o segundo valor (maior que zero)");
		b = input.nextInt();
		System.out.println("Digite o terceiro valor (maior que zero)");
		c = input.nextInt();

		if((Math.abs(b-c) < a && a < (b+c)) || (Math.abs(b-a) < c && c < (b+a)) || 
			(Math.abs(a-c) < b && b < (a+c)))
			System.out.println("Os valores são lados de triângulo.");
		else
			System.out.println("Os valores não constituem um triângulo.");
	}
}