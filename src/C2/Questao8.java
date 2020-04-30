//O programa executa o exemplo de cálculo de folha de pagamento
import java.util.Scanner;

public class Questao8{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		int a, b, c;

		System.out.print("Enter an integer: ");
		b = input.nextInt();

		System.out.print("Enter an integer: ");
		c = input.nextInt();

		a = b*c;

		System.out.println(a);

	}
}