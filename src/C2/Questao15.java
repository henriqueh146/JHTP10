import java.util.Scanner;

//Exibe a soma, o produto, a diferença e o quociente de dois inteiros dados pelo usuário
public class Questao15{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int x, y;

		System.out.print("Digite o primeiro inteiro: ");
		x = input.nextInt();
		System.out.print("Digite o segundo inteiro: ");
		y = input.nextInt();

		System.out.printf("Soma: %d.%n", x+y);

		System.out.printf("Produto: %d.%n", x*y);

		System.out.printf("Diferença: %d.%n", x-y);

		System.out.printf("Quociente: %d.%n", x/y);
	}
}