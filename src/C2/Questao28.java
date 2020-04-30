import java.util.Scanner;

public class Questao28{

	public static void main(String[] args){

		int r;
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o valor do raio (inteiro): ");
		r = in.nextInt();

		System.out.printf("\nDiâmetro = %d", 2*r);
		System.out.printf("\nCircunferência = %f", 2*Math.PI*r);
		System.out.printf("\narea = %f\n", Math.PI*r*r);
	}
}
