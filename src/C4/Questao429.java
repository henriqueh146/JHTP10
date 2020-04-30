import java.util.Scanner;

public class Questao429
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o tamanho do lado do quadrado, entre 1 e 20.");
		int size = input.nextInt();

		if(size >= 1 && size <= 20)
		{
			int i = 0;
			while(i < size)
			{
				int j = 0;
				while(j < size)
				{
					if(i == 0 || i == size-1 || j == 0 || j == size-1)
						System.out.print("*");
					else
						System.out.print(" ");
					j++;
				}
				System.out.printf("%n");
				i++;
			}
		}
		else
			System.out.println("Tamanho inválido.");
	}
}