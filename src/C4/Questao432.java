public class Questao432
{
	public static void main(String [] args)
	{
		int i = 0;
		while(i < 8)
		{
			if(i % 2 == 1)
				System.out.print(" ");

			int j = 0;
			while(j < 8)
			{
				System.out.print("* ");
				j++;
			}

			System.out.println();

			i++;
		}
	}
}