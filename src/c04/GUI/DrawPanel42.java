import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel42 extends JPanel{

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();
		int stepW = width / 15;
		int stepH = height / 15;
		int i = 0;

		int deltaX = stepW;
		int deltaY = 0;

		while( i < 15){
			g.drawLine(0, deltaY, deltaX, height);
			deltaX += stepW;
			deltaY += stepH;
			i++;
		}
	}
}