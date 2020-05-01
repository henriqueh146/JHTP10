package c03.guiCaseStudy01;

import javax.swing.JOptionPane;

public class Test{
	
	public static void main(String[] args){

		int x1, x2, sum;

		x1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer: "));

		x2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second integer: "));

		sum = x1 + x2;

		String message = String.format("The sum is %d.", sum);

		JOptionPane.showMessageDialog(null, message);
	}
}