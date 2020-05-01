package c03.q12;

import javax.swing.JOptionPane;

public class InvoiceTest{

	public static void main(String[] args){
		String number;
		String description;
		int qty;
		double price;

		number = JOptionPane.showInputDialog("Digite o número do item:");
		description = JOptionPane.showInputDialog("Digite a descrição do item: ");
		qty = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
		price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item: "));

		InvoiceQ12 teste = new InvoiceQ12(number, description, qty, price);

		JOptionPane.showMessageDialog(null, 
			String.format("Número: %s%nDescrição: %s%nQuantidade: %d%nPreço: %.2f%nTotal: %.2f%n", 
			teste.getNumber(), teste.getDescription(), teste.getQty(), teste.getPrice(), 
			teste.getInvoiceAmount()));
	}
}