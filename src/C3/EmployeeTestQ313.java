import javax.swing.JOptionPane;

public class EmployeeTestQ313{

	public static void main(String[] args){
		String frase;
		String name;
		String lastName;
		double salary;


		name = JOptionPane.showInputDialog("Digite o nome do empregado 1: ");
		lastName = JOptionPane.showInputDialog("Digite o sobrenome do empregado 1: ");
		salary = Double.parseDouble(
			JOptionPane.showInputDialog("Digite o salário do empregado 1"));

		EmployeeQ313 empregado1 = new EmployeeQ313(name, lastName, salary);

		name = JOptionPane.showInputDialog("Digite o nome do empregado 2: ");
		lastName = JOptionPane.showInputDialog("Digite o sobrenome do empregado 2: ");
		salary = Double.parseDouble(
			JOptionPane.showInputDialog("Digite o salário do empregado 2: "));

		EmployeeQ313 empregado2 = new EmployeeQ313(name, lastName, salary);

		frase = String.format("Teste dos métodos get no empregado 1:%n Nome: %s%nSobrenome: %s%n"+
			"Salário: %.2f%n", empregado1.getName(), empregado1.getLastName(), 
			empregado1.getSalary());
		JOptionPane.showMessageDialog(null, frase);

		name = JOptionPane.showInputDialog("Teste dos métodos set no empregado 1. Digite um novo"+
			"nome: ");
		lastName = JOptionPane.showInputDialog("Digite um nome sobrenome: ");
		salary = Double.parseDouble(JOptionPane.showInputDialog("Digite um novo salário: "));
		JOptionPane.showMessageDialog(null, "Processando.....");
		empregado1.setName(name);
		empregado1.setLastName(lastName);
		empregado1.setSalary(salary);
		frase = String.format("Resultado:%nNome: %s%nSobrenome: %s%nSalário: %.2f%n",
			empregado1.getName(), empregado1.getLastName(), empregado1.getSalary());
		JOptionPane.showMessageDialog(null, frase);

		JOptionPane.showMessageDialog(null, "Aumento de 10% no salário");
		empregado1.setSalary(empregado1.getSalary()*1.1);
		empregado2.setSalary(empregado2.getSalary()*1.1);

		frase = String.format("Salários aumentados. Valor atual: %nNome %s%nSalário: %.2f%n%nNome: "+
		"%s%nSalário: %.2f", empregado1.getName(), empregado1.getSalary(), empregado2.getName(),
		empregado2.getSalary());

		JOptionPane.showMessageDialog(null, frase);

		frase = String.format("Salários anuais (sn): %nNome: %s%nsn: %.2f%n%nNome: %s%nsn: %.2f",
			empregado1.getName(), empregado1.getSalary()*12, empregado2.getName(), 
			empregado2.getSalary()*12);
		JOptionPane.showMessageDialog(null, frase);
	}
}