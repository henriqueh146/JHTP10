import java.util.Scanner;

public class Questao437
{
	public static int fatorial(int n)
	{
		int fat = n;
		int i = 1;
		if(n > 0)
		{
			while(n != i)
			{
				fat *= (n-i);
				i++; 
			}
		}
		else
			fat = 1;
		return fat;
	}

	public static double calculaE(int numTermos)
	{
		double e = 0;
		int i = 0;
		while(i < numTermos)
		{
			e += (double)1 / fatorial(i);
			i++;
		}
		return e;
	}

	public static double calculaEx(int numTermos, int x)
	{
		double ex = 0;
		int i = 0;

		while(i < numTermos)
		{
			int potenciaDeX = 1;
			int j = 0;
			while(j < i)
			{
				potenciaDeX *= x;
				j++;
			}

			ex += (double)potenciaDeX / fatorial(i);
			i++;
		}
		return ex;
	}

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		int numTermos;
		int x;

		System.out.println("Digite o número para calcular n!");
		n = input.nextInt();
		System.out.println("n! = " + fatorial(n));

		System.out.println("Digite o número de termos para calcular a constante e");
		numTermos = input.nextInt();
		System.out.println("e = " + calculaE(numTermos));

		System.out.println("Digite o número de termos para calcular e elevado a x");
		numTermos = input.nextInt();
		System.out.println("Digite x (inteiro)");
		x = input.nextInt();
		System.out.println("e elevado a x = " + calculaEx(numTermos, x));
	}
}