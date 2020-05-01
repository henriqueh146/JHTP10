/*
Calcule o salário bruto de cada um de 3 empregados. A cada hora extra (acima de 40), eles recebem 50% a 
mais por hora. Entrada: lista de empregados, número de horas trabalhadas por semana, salário-hora.
Coletar as informações, calcular e exibir o salário bruto.  

Receba os dados dos três empregados, calcule e exiba seu salário bruto.

Ref. I
Declarar e inicializar variáveis
Inserir os dados, calcular e exibir o salário bruto

Ref. II
Declare
nomeDoEmpregado
horasTrabalhadas
salarioHora
salarioBruto

Repita 3x 
	Prompt para inserir os dados
	Se horasTrabalhadas for maior que 40
		salarioBruto será 40*salarioHora + 1.5*salarioHora*(horasTrabalhadas - 40)
	Senão
		salarioBruto será horasTrabalhadas*salarioHora
	Exiba o salário bruto

*/
import java.util.Scanner; 

public class Questao420
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		String nomeDoEmpregado;
		int horasTrabalhadas;
		double salarioHora;
		double salarioBruto;
		int cont = 0;

		while(cont < 3)
		{
			System.out.println("Insira o nome do empregado: ");
			nomeDoEmpregado = input.nextLine();
			System.out.println("Insira a quantidade de horas trabalhadas na semana passada:");
			horasTrabalhadas = input.nextInt();
			input.nextLine();
			System.out.println("Insira o salário-hora do empregado:");
			salarioHora = input.nextDouble();
			input.nextLine();
			
			if(horasTrabalhadas > 40)
				salarioBruto = 40 * salarioHora + 1.5 * salarioHora * (horasTrabalhadas - 40);
			else
				salarioBruto = horasTrabalhadas * salarioHora;
			System.out.printf("O salario bruto do empregado eh %.2f\n\n", salarioBruto);
			cont++;
		}
	}
}