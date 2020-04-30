 public class TesteBloco
 {

 	public static void main(String [] args)
 	{
 		int x=0;

 		{
 			System.out.println("Teste %nde bloco");
 			x += 10;
 			System.out.printf("O valor de x calculado neste bloco é x=%d\n", x);
 		}

 	}
 }