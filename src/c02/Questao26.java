import java.util.Scanner;

public class Questao26{

	public static void main(String [] args){
		int a, b;
		Scanner in = new Scanner(System.in);

		System.out.print("Insira um inteiro: ");
		a = in.nextInt();
		System.out.print("Insira outro inteiro: ");
		b = in.nextInt();

		if(a > b){
			if(a % b == 0){
				System.out.printf("\n%d é múltiplo de %d.\n", a, b);
			}else{
				System.out.printf("\n%d não é múltiplo de %d.\n", a, b);
			}
		}else if(b > a){
			if(b % a == 0){
				System.out.printf("\n%d é múltiplo de %d.\n", b, a);
			}else{
				System.out.printf("\n%d não é múltiplo de %d.\n", b, a);
			}
		}else {
			System.out.print("\nOs inteiros são iguais.\n");
		}

	}
}