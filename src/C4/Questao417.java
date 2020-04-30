//cada refinamento é uma especificação completa do algoritmo, só o nível de detalhe varia
//muitos alg. podem ser divididos em 3 fases: inicialização; processamento; conclusão
//Instrução que fornece a função geral do programa;
//Primeiro refinamento: tarefas menores, listadas na ordem em que elas serão realizadas (usa est. de seq.)
//Os próximos refinamentos especificam as instruções do primeiro mais detalhadamente, até que seja
//possível a "conversão" direta para uma linguagem de programação
/**********************************************************************************************************
Topo
Calcular e exibir o consumo de cada viagem, a quilometragem total, os litros comb. gastos até esse ponto

1o Refinamento
Inicializar variáveis
Insira, calcule o consumo, o km e os litros e imprima

2o Refinamento
Inicialize quilTotal como zero
Inicialize combTotal como zero
Declare consumo, quilAtual, combAtual

Enquanto quilAtual for maior ou igual a zero, faça
	Insira a quil. atual. Digite -1 para encerrar.
	Se o número for maior ou igual a zero, faça
		Insira combAtual
		Calcule consumo em ponto flutuante e imprima
		Acumule quilTotal e combTotal e imprima
Fim
************************************************************************************************************/
import java.util.Scanner;

public class Questao417{

	public static void main(String[] args){

		int quilTotal = 0;
		int combTotal = 0;
		int quilAtual = 0, combAtual;
		double consumo;
		Scanner input = new Scanner(System.in);

		while(quilAtual >= 0){
			System.out.println("Insira a quilometragem dirigida, ou -1 para encerrar: ");
			quilAtual = input.nextInt();
			if(quilAtual >= 0){
				System.out.println("Insira o combustível gasto na viagem:");
				combAtual = input.nextInt();

				consumo = (float) quilAtual / combAtual;
				System.out.printf("%nO consumo desta viagem foi %.2f quilometros por litro%n", consumo);

				quilTotal += quilAtual;
				combTotal += combAtual;
				System.out.printf("O combustível total gasto foi %d litros.%nO total rodado foi %d quilometros%n%n",
					combTotal, quilTotal);
			}
		}
	}
}