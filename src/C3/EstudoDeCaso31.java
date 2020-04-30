import javax.swing.JOptionPane;

public class EstudoDeCaso31{
	
	public static void main(String[] args){

		int x1, x2, sum;

		x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro inteiro da soma: "));

		x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo inteiro da soma: "));

		sum = x1 + x2;

		String message = String.format("A soma é %d.", sum);

		JOptionPane.showMessageDialog(null, message);
	}
}