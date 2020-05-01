import java.util.Scanner;

public class Questao32{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int a, p = 0, n = 0, z = 0;
		System.out.print("Insira um número inteiro: ");
		a = in.nextInt();
		if(a > 0)
			p++;
		else if (a < 0)
			n++;
		else
			z++;
		System.out.print("Insira um número inteiro: ");
		a = in.nextInt();
		if(a > 0)
			p++;
		else if (a < 0)
			n++;
		else
			z++;
		System.out.print("Insira um número inteiro: ");
		a = in.nextInt();
		if(a > 0)
			p++;
		else if (a < 0)
			n++;
		else
			z++;
		System.out.print("Insira um número inteiro: ");
		a = in.nextInt();
		if(a > 0)
			p++;
		else if (a < 0)
			n++;
		else
			z++;
		System.out.print("Insira um número inteiro: ");
		a = in.nextInt();
		if(a > 0)
			p++;
		else if (a < 0)
			n++;
		else
			z++;
		System.out.printf("\nForam inseridos %d positivos, %d negativos e %d zeros.\n", p, n, z);

	}
}