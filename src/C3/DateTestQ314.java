import javax.swing.JOptionPane;

public class DateTestQ314{

	public static void main(String[] args){

		int mes = 3;
		int dia = 12;
		int ano = 2019;

		DateQ314 dataTeste = new DateQ314(mes, dia, ano);

		JOptionPane.showMessageDialog(null, String.format("Teste dos metodos get:%n"+
			"mes = %d%ndia = %d%nano = %d", dataTeste.getMes(), dataTeste.getDia(), 
			dataTeste.getAno()));

		mes = Integer.parseInt(JOptionPane.showInputDialog("Teste dos métodos set. Digite um mes."));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Diagite um dia."));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano."));

		dataTeste.setMes(mes);
		dataTeste.setDia(dia);
		dataTeste.setAno(ano);

		JOptionPane.showMessageDialog(null, "O resultado será mostrado no teste do método displayDate().");

		dataTeste.displayDate();
	}
}