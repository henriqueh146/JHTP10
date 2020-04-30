/*
Os operadores unários de pré ou de pós incremento (ou decremento) devem estar imediatamente ao lado da 
variável a qual são aplicados. Na questão o operador de pré-incremento está ao lado do parêntesi do qual
sái o resultado de uma expressão, portanto um valor, e não uma variável.
*/

public class Questao434
{
	public static void main(String [] args)
	{
		int x = 4, y = 6;
		System.out.println(1 + (x + y));
	}
}