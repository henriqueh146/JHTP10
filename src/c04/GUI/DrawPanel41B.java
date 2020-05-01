import java.awt.Graphics;
import javax.swing.JPanel;

/*As extremidades, no meio do painel, das linhas que se originam em um canto devem se tocar
com as extremidades das linhas do canto oposto. Isso será possível se os loops das linhas dos 
cantos opostos iniciarem do mesmo ponto, pois se iniciar do outro lado, elas não se tocarão quando 
os passos forem diferentes. */
public class DrawPanel41B extends JPanel{


	public void paintComponent(Graphics g){

		super.paintComponent(g);

		int height = getHeight();
		int width = getWidth();
		int x = 0;
		int y = height;
		int passoW = width/15;
		int passoH = height/15;
		System.out.println("Passos: de largura = "+passoW+"; de altura: "+passoH);
		System.out.println("Altura = "+height+"; Largura = "+width);
		for(int i = 0; i < 15; i++){

			g.drawLine(0, 0, x, y);
			x += passoW;
			y -= passoH;

			System.out.printf("Canto superior esq. passo %d, extremidade (%d, %d)%n", i+1, x, y);
		}
		System.out.println("**********************************************");
		x = width;
		y = height;

		for(int i = 0; i < 15; i++){

			g.drawLine(width, 0, x, y);
			x -= passoW;
			y -= passoH;
			System.out.printf("Canto superior dir. passo %d, extremidade (%d, %d)%n", i+1, x, y);
		}
		System.out.println("**********************************************");
		x = 0;
		y = height;

		for(int i = 0; i < 15; i++){

			g.drawLine(width, height, x, y);
			x += passoW;
			y -= passoH;
			System.out.printf("Canto inferior dir. passo %d, extremidade (%d, %d)%n", i+1, x, y);

		}
		System.out.println("**********************************************");
		x = width;
		y = height;

		for(int i = 0; i < 15; i++){

			g.drawLine(0, height, x, y);
			x -= passoW;
			y -= passoH;
			System.out.printf("Canto inferior esq. passo %d, extremidade (%d, %d)%n", i+1, x, y);
		}
	}
}