import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel42B extends JPanel{

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();
		int passoW = width / 15;
		int passoH = height / 15;
		int i = 0;

		while(i < 15){
			g.drawLine(0, passoH * i, passoW *(i + 1), height);
			i++;
		}

		i = 0;

		while(i < 15){
			g.drawLine(passoW * i, 0, width, passoH * (i + 1));
			i++;
		}

		i = 0;

		while(i < 15){
			g.drawLine(0, height - (passoH * i), passoW * (i + 1), 0);
			i++;
		}

		i = 0;

		while(i < 15){
			g.drawLine(width, passoH * i, width - (passoW * (i + 1)),  height);
			i++;
		}
	}
}