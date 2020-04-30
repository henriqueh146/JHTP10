import java.util.Scanner;

public class Questao436
{
	public static void main(String [] args)
	{
		int a, b, c, c1, c2, h;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (maior que zero)");
		a = input.nextInt();
		System.out.println("Digite o segundo valor (maior que zero)");
		b = input.nextInt();
		System.out.println("Digite o terceiro valor (maior que zero)");
		c = input.nextInt();

			if((a*a == (b*b + c*c)) || (b*b == (a*a + c*c)) || (c*c == (a*a + b*b)))
				System.out.println("Os valores inseridos constituem um triângulo retângulo");
			else
				System.out.println("Os valores não constituem um triângulo retângulo");
	}
}