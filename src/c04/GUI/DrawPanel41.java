import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel41 extends JPanel{

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();
		int passoW = width/15;
		int passoH = height/15;
		int x = 0;
		int y = height;

		for(int i = 0; i < 15; i++){

			g.drawLine(0, 0, x, y);
			x += passoW;
			y -= passoH;

		}

		//System.out.printf("%n(%d,%d)%n", x, y);

	}
}