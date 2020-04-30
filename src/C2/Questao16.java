import java.util.Scanner;

public class Questao16{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int x, y;

		System.out.print("Insira o primeiro inteiro: ");
		x = input.nextInt();

		System.out.print("Insira o segundo inteiro: ");
		y = input.nextInt();

		if(x > y)
			System.out.printf("%d is larger.%n", x);
		else if(y > x)
			System.out.printf("%d is larger.%n", y);
		else
			System.out.printf("These numbers are equals.%n");

	}
}