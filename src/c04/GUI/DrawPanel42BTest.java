import javax.swing.JFrame;

public class DrawPanel42BTest{

	public static void main(String[] args){

		DrawPanel42B panel = new DrawPanel42B();

		JFrame app = new JFrame();

		app.setSize(500,500);
		app.add(panel);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}