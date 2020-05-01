import java.util.Scanner;

public class ClassAverage{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int total = 0;
		int counter = 1;

		while(counter <= 10){
			System.out.printf("%nDigite a %da nota: ", counter);
			total = total+input.nextInt();
			counter++;
		}

		System.out.printf("A média é %d.", total/10);
	}
}