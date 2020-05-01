import java.util.Scanner;

public class ClassAverage2{

	public static void main(String [] args){

		int total = 0;
		int counter = 0;
		int grade;
		Scanner input = new Scanner(System.in);

		System.out.printf("Insira a %da nota, ou -1 para sair:", counter+1);
		grade = input.nextInt();

		while(grade != -1){

			counter++;
			total = total + grade;
			System.out.printf("Insira a %da nota, ou -1 para sair:", counter+1);
			grade = input.nextInt();
		}

		if(counter != 0){
			System.out.printf("Média: %.2f", (double)total/counter);
		}else{
			System.out.printf("Nenhuma nota foi inserida.");
		}

	}
}