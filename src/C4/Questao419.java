/*
200/semana + 9% venda bruta/semana
fornecido: lista de itens vendidos por vendedor

Receba itens vendidos e calcule e exiba os rendimentos do vendedor, sem limites de itens a serem vendidos

Ref I
Declare as variáveis: valor, total (inic. como zero), comissao = .9, salBase = 200.0
Insira e acumule os valores de cada venda
Calcule e exiba os rendimentos do vendedor.

Ref II
Inicialize
total como zero
comissao como 9%
salBase como R$ 200.00
Declare
rendimentos
valor

Solicitar o primeiro valor
Enquanto o valor inserido for maior ou igual a zero
	acumule o valor na variável total
	Solicite o próximo valor

Calcule os rendimentos do vendedor como a soma do salário base com a comissão sobre o total vendido
Exiba os rendimentos
*/
import java.util.Scanner;

public class Questao419
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		double total = 0.0;
		double comissao = .09;
		double salBase = 200.0;
		double rendimentos;
		double valor;

		System.out.println("Insira o valor da venda (ou -1 para sair): ");
		valor = input.nextDouble();

		while(valor >= 0.0){
			total += valor;
			System.out.println("Insira o valor da venda (ou -1 para sair): ");
			valor = input.nextDouble();
		}

		rendimentos = salBase + comissao * total;

		System.out.printf("Rendimentos do vendedor: R$ %.2f.\n", rendimentos);
	}
}