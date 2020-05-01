//O programa calcula o produto de 3 inteiros
import java.util.Scanner;

public class Questao5{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		int x, y, z, result;

		System.out.print("Insira o primeiro inteiro: ");
		x = input.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		y = input.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		z = input.nextInt();

		result = x*y*z;

		System.out.printf("%nO resultado é %d.%n", result);
	}
}