import java.util.Scanner;

public class Questao25{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int numero;

		System.out.print("Insira um inteiro: ");
		numero = in.nextInt();

		if(numero % 2 == 0)
			System.out.printf("\nO número %d é par.\n", numero);
		else
			System.out.printf("\nO número %d é ímpar.\n", numero);
	}

}