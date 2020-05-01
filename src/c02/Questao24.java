import java.util.Scanner;

public class Questao24{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int a, b, c, d, e, maior, menor;

		System.out.printf("%nDigite o primeiro inteiro:%n");
		a = input.nextInt();
		maior = a;
		menor = a;
		System.out.printf("%nDigite o segundo inteiro:%n");
		b = input.nextInt();
		if(maior < b)
			maior = b;
		else if(menor > b)
			menor = b;
		System.out.printf("%nDigite o terceiro inteiro:%n");
		c = input.nextInt();
		if(maior < c)
			maior = c;
		else if(menor > c)
			menor = c;
		System.out.printf("%nDigite o quarto inteiro:%n");
		d = input.nextInt();
		if(maior < d)
			maior = d;
		else if(menor > d)
			menor = d;
		System.out.printf("%nDigite o quinto inteiro:%n");
		e = input.nextInt();
		if(maior < e)
			maior = e;
		else if(menor > e)
			menor = e;

		if(a == b && b == c && d == e){ // todos os ints são iguais
			System.out.println("Os inteiros são todos iguais ("+a+").");
		}else {
			System.out.println("O maior é "+maior+" e o menor é "+menor+".");
		}
	}
}

/*

else if(a == b || a == c || a == d || a == e || b == c || b == d || b == e ||  // existe ints repetidos
			c == d || c == e || d == e){
			if(a == b && b == c && c == d && a != e){ // todos são iguais, exceto 'e'

			}else if(b == c && c == d && d == e && b != a){ // todos são iguais exceto 'a'

			}else if(a == b && b == d && d == e && a != c){ // todos são iguais exceto 'c'

			}else if(a == b && b == c && c == e && a != d){ // todos são iguais exceto 'd'

			}else if(a == c && c == d && d == e && a != b){ // todos são iguais exceto "b"

			}else if(a == b && b == c && a != d && a != e){ // 'a', 'b', 'c' iguais, mas diferentes de 'd' e 'e' 

			}
		}else{ // todos os inteiros são diferentes

			maior = a;
			if (maior > b){
				menor = b;
			}else{
				maior = b;
				menor = a;
			}
			if (maior < c){
				maior = c;
			}else if(menor > c){
				menor = c;
			}
			if (maior < d){
				maior = d;
			}else if(menor > d){
				menor = d;
			}
			if (maior < e){
				maior = e;
			}else if(menor > e){
				menor = e;
			}

			System.out.println("O número maior é "+maior+"e o número menor é "+menor+".");
		}

*/