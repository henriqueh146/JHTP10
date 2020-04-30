import java.util.Scanner;

public class Questao3e4 {
	
	public static void main(String [] args){
		int c, thisIsAVariable, q76354, number; //q3a

		Scanner input = new Scanner(System.in);

		System.out.print("Insira um inteiro: "); //q3b
		//q2c
		int value;
		value = input.nextInt();

		System.out.println("This is a Java program."); //q3d

		System.out.printf("%s%n%s%n", "This is a Java", "program"); //q3e

		number = 6;

		if(number != 7)
			System.out.println("The variable number is not equal to 7."); //q3f

		c = 2;

		if(c < 7)
			System.out.println("c is less than 7"); //q4a

		if(c >= 7)
			System.out.println("c is equal to or greater than 7"); //q4b
	}
}