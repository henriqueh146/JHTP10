/*
Ler número de 5 dígitos e determinar se é um palíndromo ou não. Se não tiver 5 dígitos, 
permitir que o usuário  digite um novo valor.

Leitura do número
Verificar se tem 5 dígitos. Se não tiver, solicitar novo valor
Verificar se é um palíndromo 
Imprimir o resultado.

Declarar (boolean) palindromo e (int) numero
Verificar a divisão inteira por 10000. Se for maior que zero e menor que 10, então o número terá 5 dígitos.
Enquanto o usuário não inserir um valor com 5 dígitos, solicite outro valor.
Se o número dividido por 10^4 for igual ao resto da divisão entre o número e a divisão entre ele e 10
E se o resto da divisão entre número dividido por 10^3 e 10^1 for igual ao resto da divisão entre o 
número e 10^2 dividido por 10^1
palíndromo recebe true  no fim do loop se todos são iguais.

*/
import java.util.Scanner;

public class Questao430
{
	public static void main(String [] args)
	{
		int numero;
		boolean palindromo = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número");
		numero = input.nextInt();
		while(numero/10000 == 0 || numero/10000 > 9)
		{
			System.out.println("O número não tem 5 dígitos. Digite um número com 5 dígitos");
			numero = input.nextInt();
		}
		if(numero/10000 == Math.floorMod(numero, numero/10))
		{
			if(Math.floorMod(numero / 1000, 10) == Math.floorMod(numero, 100) / 10)
				palindromo = true;
		}
		if(palindromo)
			System.out.println("O número é um palíndromo");
		else
			System.out.println("O número não é um palíndromo");
	}
}