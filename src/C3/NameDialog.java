import javax.swing.JOptionPane;

public class NameDialog{

	public static void main(String[] args){

		String name = JOptionPane.showInputDialog("Digite seu nome: ");

		String message = String.format("Bem-vindo ao Java, %s.", name);

		JOptionPane.showMessageDialog(null, message);
	}
}