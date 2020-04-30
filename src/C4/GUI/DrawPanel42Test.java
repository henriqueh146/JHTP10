import javax.swing.JFrame;

public class DrawPanel42Test{

	public static void main(String[] args){
		DrawPanel42 panel = new DrawPanel42();

		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 500);
		janela.add(panel);
		janela.setVisible(true);

	}
}