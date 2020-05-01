/*
Converta uma entrada binária para decimal

Declarar variáveis
Receber a entrada binária, isolar os dígitos e multiplicar por sua posição
Somar e imprimir a saída

Variáveis
int binario
int decimal
variáveis de controle

Solicitar entrada binária do usuário
salvar na variável binario
binario % 10 -> primeiro dígito
(binario % 100) / 10 -> segundo dígito
(binario % 1000) / 100 -> terceiro dígito
(binário % 10000) / 1000 -> quarto dígito
(binário % 100000) / 10000 -> quinto dígito  
*/
import java.util.Scanner;

public class Questao431
{
	public static void main(String [] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um numero binario.");
		int binario = input.nextInt();
		
		int decimal = 0;
		int divResto = 10;
		int divisor = 1;
		int pos = 1;
		do
		{
			decimal += pos*((binario % divResto) / divisor);
			pos *= 2;
			divResto *= 10;
			divisor *= 10;

		}
		while(binario / divisor != 0);
		
		System.out.println("Decimal: "+decimal);
	}
}