/*
Inserir o número, comparar com os dois maiores. Se for maior que um dos dois, salvar no menor. 

*/
import java.util.Scanner;

public class Questao423
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int number, counter = 0, largest = 0, largest2 = 0;

		while(counter < 10)
		{
			System.out.println("Insira um inteiro.");
			number = input.nextInt();
			if(number > largest)
			{
				largest2 = largest;
				largest = number;
			}else if(number > largest2)
				largest2 = number;

			counter++;
		}

		System.out.printf("Os maiores numeros sao: %d e %d\n", largest, largest2);
	}
}