public class Questao422{
	
	public static void main(String[] args){

		int i = 1;
		System.out.printf("N\t10*N\t100*N\t1000*N\n\n");
		while(i <= 5)
		{
			System.out.printf("%d\t%d\t%d\t%d\n", i, i*10, i*100, i*1000);
			i++;
		}
	}
}