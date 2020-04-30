import java.util.Scanner;

public class Questao30{

	public static void main(String[] args){

		int x;
		Scanner in = new Scanner(System.in);

		System.out.print("Digite um número com 5 dígitos: ");
		x = in.nextInt();

		System.out.printf("\n%d %d %d %d %d \n", x/10000, x%10000/1000, (x%10000)%1000/100, 
			((x%10000)%1000)%100/10, (((x%10000)%1000)%100)%10);
	}
}