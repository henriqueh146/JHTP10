import java.util.Scanner;

public class Questao17{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int x, y, z;

		System.out.print("Insira o primeiro inteiro: ");
		x = input.nextInt();

		System.out.print("Insira o segundo inteiro: ");
		y = input.nextInt();

		System.out.print("Insira o terceiro inteiro: ");
		z = input.nextInt();

		System.out.printf("Soma: %d.%n", x+y+z);

		System.out.printf("Média: %d.%n", (x+y+z)/3);

		System.out.printf("Produto: %d.%n", x*y*z);

		if(x == y && y == z) // Os três números são iguais?
			System.out.println("Os três inteiros são iguais.");
		else if(x == y || x == z || z == y){ // Dois destes números são iguais, e um é diferente?
			if (x == y){ //Os iguais são x e y ?
				if(x > z) //Os iguais são maiores ou menores que o diferente?
					System.out.printf("Os inteiros x = %d e y = %d são iguais e maiores que z = %d.%n", x, y, z);
				else
					System.out.printf("Os inteiros x = %d e y = %d são iguais e menores que z = %d.%n", x, y, z);
			}else if(x == z){ //Os iguais são x e z?
				if(x > y) //Os iguais são maiores ou menores que o diferente?
					System.out.printf("Os inteiros x = %d e z = %d são iguais e maiores que y = %d.%n", x, z, y);
				else
					System.out.printf("Os inteiros x = %d e z = %d são iguais e menores que y = %d.%n", x, z, y);
			}else { //Se x != y e x != z, então a única alternativa é que y seja igual a z
				if(y > x) //Os iguais são maiores ou menores que o diferente?
					System.out.printf("Os inteiros y = %d e z = %d são iguais e maiores que x = %d.%n", y, z, x);
				else
					System.out.printf("Os inteiros y = %d e z = %d são iguais e menores que x = %d.%n", y, z, x);
			}
		} else if(x > y){
			if(x > z){
				if(y > z)
					System.out.printf("O inteiro x = %d é o maior, e o z = %d é o menor.%n", x, z);
				else
					System.out.printf("O inteiro x = %d é o maior, e o y = %d é o menor.%n", x, y);
			} else
				System.out.printf("O inteiro z = %d é o maior, e o inteiro y = %d é o menor.%n", z, y);
		} else if(x > z){
			System.out.printf("O inteiro y = %d é o maior, e z = %d é o menor.%n", y, z);
		} else if(y > z)
			System.out.printf("O inteiro y = %d é o maior, e x = %d é o menor. %n", y, x);
		else
			System.out.printf("O inteiro z = %d é o maior, e x = %d é o menor.%n", z, x);
	}
}