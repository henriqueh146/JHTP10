public class Increment{

	public static void main(String[] args){

		int c = 5;
		System.out.printf("c antes do pós-incremento = %d%n", c);
		System.out.printf("pós-incrementando c: %d%n", c++);
		System.out.printf("c após o pós-incremento = %d%n", c);

		c = 5;
		System.out.println();
		System.out.printf("c antes do pré-incremento = %d%n", c);
		System.out.printf("pré-incrementando c: %d%n", ++c);
		System.out.printf("c após o pré-incremento: %d%n", c);
	}
}