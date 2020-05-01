import javax.swing.JFrame;

public class DrawPanel41Test{

	public static void main(String[] args){

		DrawPanel41 panel = new DrawPanel41();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}
}