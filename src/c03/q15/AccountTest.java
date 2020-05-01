package c03.q15;

import java.util.Scanner;

public class AccountTest{

	public static void main(String[] args){

		double depositAmount;
		AccountQ311 account1 = new AccountQ311("Jane Green", 50.00);
		AccountQ311 account2 = new AccountQ311("John Blue", -7.53);

		displayAccount(account1);
		displayAccount(account2);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

	}

	public static void displayAccount(AccountQ311 account){
		System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
	}
}