import java.util.Scanner;

public class Analysis{

	public static void main(String[] args){

		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		Scanner input = new Scanner(System.in);
		int result;


		while(studentCounter <= 10){

			System.out.print("Insira o resultado (1 para aprovado, 2 para reprovado:");
			result = input.nextInt();

			if(result ==1){
				passes++;
			}else{
				failures++;
			}

			studentCounter++;
		}

		System.out.printf("Passes = %d%nFailures = %d%n", passes, failures);
		if(passes > 8){
			System.out.printf("Bonus to professor!");
		}

	}
}