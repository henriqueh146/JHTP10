import javax.swing.JFrame;

public class DrawPanelTest{

	public static void main(String[] args){

		DrawPanel panel = new DrawPanel();

		JFrame application = new JFrame();

		application.setSize(800,800);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setVisible(true);
		
	}
}