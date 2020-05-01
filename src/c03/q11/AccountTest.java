package c03.q11;

import javax.swing.JOptionPane;

public class AccountTestQ311{

	public static void main(String[] args){


		double depositAmount;
		AccountQ311 account1 = new AccountQ311("Jane Green", 50.00);
		AccountQ311 account2 = new AccountQ311("John Blue", -7.53);

		//Gerando string formatada para exibir no diálogo de mensagem.
		JOptionPane.showMessageDialog(null, String.format("%s balance: $%.2f%n%s balance: $%.2f%n", 
			account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance()));
		
		//Convertendo string recebida na caixa de diálogo de entrada para fazer o depósito
		depositAmount = Double.parseDouble(
			JOptionPane.showInputDialog("Enter deposit amount for account1: "));

		JOptionPane.showMessageDialog(null, 
			String.format("%nadding %.2f to account1 balance%n%n", depositAmount));
		account1.deposit(depositAmount);

		JOptionPane.showMessageDialog(null, String.format("%s balance: $%.2f%n%s balance: $%.2f%n", 
			account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance()));


		System.out.printf("Enter deposit amount for account2: ");
		depositAmount = Double.parseDouble(
			JOptionPane.showInputDialog("Enter deposit amount for account2: "));
		JOptionPane.showMessageDialog(null, String.format("%nadding %.2f to account2 balance%n%n", 
			depositAmount));
		account2.deposit(depositAmount);

		JOptionPane.showMessageDialog(null, String.format("%s balance: $%.2f%n%s balance: $%.2f%n", 
			account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance()));




		/******************************WITHDRAW***************************************/
		
		double debt = Double.parseDouble(
			JOptionPane.showInputDialog("Enter debt amount for account1: "));
		JOptionPane.showMessageDialog(null, 
			String.format("%ndebting %.2f to account1 balance%n%n", debt));
		account1.withdraw(debt);

		JOptionPane.showMessageDialog(null, String.format("%s balance: $%.2f%n%s balance: $%.2f%n", 
			account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance()));
		

		debt = Double.parseDouble(JOptionPane.showInputDialog("Enter debt amount for account2: "));
		JOptionPane.showMessageDialog(null,
			String.format("%ndebting %.2f to account2 balance%n%n", debt));
		account2.withdraw(debt);

		JOptionPane.showMessageDialog(null, String.format("%s balance: $%.2f%n%s balance: $%.2f%n", 
			account1.getName(), account1.getBalance(), account2.getName(), account2.getBalance()));
		
	}
}