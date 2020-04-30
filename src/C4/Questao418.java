/*
Determinar se um cliente excedeu o limite de crédito em uma conta corrente. Os dados são inteiros; 
calcular novo saldo, exibir novo saldo; determinar se o novo saldo excede o limite de crédito. Se excedeu, 
avisa.
Número da conta
Saldo no início do mês
Total de todos os itens cobrados no mês
Total de créditos aplicados ao cliente
Limite de crédito autorizado

Inserir os dados, calcular o saldo e determinar se ele ultrapassa o limite.

Ref. I
Declarar e inicializar variáveis
Inserir os dados, cálculo e exibição do saldo
Verificar limite. Se excedeu, imprimir mensagem.

Ref II
Declare numConta (string), saldoInicial, saldoFinal, debito, credito, limite (inteiros)

Solicitar os dados correspondentes às variáveis com o prompt: 'Insira ...'
Calcular o saldo: saldoInicial - credito + debito
Imprimir novo saldo

Se o novo saldo for maior que o limite
	Imprima: 'Limite de credito excedido'
*/
import java.util.Scanner;

public class Questao418
{
	public static void main(String [] args)
	{	
		Scanner input = new Scanner(System.in);
		
		String numConta;
		int saldoInicial, saldoFinal, debito, credito, limite;

		System.out.println("Insira o numero da conta: ");
		numConta = input.nextLine();

		System.out.println("Insira o saldo no inicio do mes: ");
		saldoInicial = input.nextInt();

		System.out.println("Insira o total de todos os itens cobrados no mes: ");
		debito = input.nextInt();

		System.out.println("Insira o total de creditos aplicados: ");
		credito = input.nextInt();

		System.out.println("Insira o limite de credito autorizado");
		limite = input.nextInt();

		saldoFinal = saldoInicial + debito - credito;
		System.out.printf("Valor do saldo: %d\n", saldoFinal);

		if(saldoFinal > limite)
			System.out.println("Limite de credito excedido.");
	}

}