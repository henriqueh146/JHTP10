/*Após certo ponto, o programa começa imprime um número negativo; depois começa a imprimir zeros. 
Variáveis de tipo inteiro podem armazenar valores entre -2.147.483.648 a 2.147.483.647. 
Ao tentar multiplicar 1.073.741.824 por 2, a variável passou do limite positivo; armazenou seu limite
negativo e, então, ao tentar multiplicá-lo por 2 novamente, armazenou zero.

*/

public class Questao433
{
	public static void main(String [] args)
	{
		int multiplos = 2;

		while(true)
		{
			System.out.println(multiplos);
			multiplos *=2;
		}
	}
}