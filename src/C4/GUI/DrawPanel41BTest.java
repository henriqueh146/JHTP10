import javax.swing.JFrame;

public class DrawPanel41BTest{

	public static void main(String [] args){

		DrawPanel41B panel = new DrawPanel41B();

		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}
}