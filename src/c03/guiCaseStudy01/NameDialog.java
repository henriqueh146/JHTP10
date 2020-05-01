package c03.guiCaseStudy01;

import javax.swing.JOptionPane;

public class NameDialog{

	public static void main(String[] args){

		String name = JOptionPane.showInputDialog("Enter your name: ");

		String message = String.format("Welcome to Java, %s.", name);

		JOptionPane.showMessageDialog(null, message);
	}
}