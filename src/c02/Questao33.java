import java.util.Scanner;

public class Questao33{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int altura, peso, opt, imc;
		System.out.print("Insira 1 para libras e polegadas, ou 2 para kilogramas e centimetros: ");
		opt = input.nextInt();

		System.out.printf("Insira seu peso: ");
		peso = input.nextInt();
		System.out.printf("Insira sua altura: ");
		altura = input.nextInt();

		if(opt == 1){
			imc = (703*peso)/(altura*altura);
		} else {
			imc = peso/(altura*altura/10000);
		}

		System.out.printf("\nSeu IMC tem o valor de %d.\n"+
		"Segundo o Department of Health and Human Services/National Institutes of Health,"+
		" estes são os valores de cada categoria de peso:\n"+
		"Abaixo do peso: menos de 18.5\n"+
		"Normal: entre 18.5 e 24.9\n"+
		"Acima do peso: entre 25 e 29.9\n"+
		"Obeso: 30 ou mais", imc);
	}
}