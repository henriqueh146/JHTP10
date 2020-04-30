/*
entrada: 10 inteiros
determina e exibe o maior
utilizar:
counter (até 10)
number
largest

Receba 10 inteiros, determine e exiba o maior

Ref. I
Declare e inicialize as variáveis
Receba 10 inteiros, determine o maior deles
Exiba o maior

Ref. II
Declare: number, counter como zero, largest como zero

Enquanto o counter for menor que 10
	Receba um inteiro e atribua a number
	se o number for maior que o largest, atribua number a largest
	incremente counter
Imprima largest

*/

import java.util.Scanner;

public class Questao21
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int number, counter = 0, largest = 0;

		while(counter < 10)
		{
			System.out.println("Insira um inteiro.");
			number = input.nextInt();
			if(number > largest)
				largest = number;
			counter++;
		}

		System.out.printf("O maior numero eh: %d\n", largest);
	}
}