import java.util.Scanner;

public class Questao34{

	public static void main(String[] args){

		double pop;
		double tcd;
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Insira a população mundial atual: \n");
		pop = in.nextDouble();
		System.out.printf("Insira a taxa de crescimento demográfico: \n");
		tcd = in.nextDouble();

		for(int i=1; i <= 5; i++){
			System.out.printf("\nA população em %d ano(s) será de %f.\n", i, (pop+(pop*tcd*i/100)));
		}
	}
}