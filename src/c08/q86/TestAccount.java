package c08.q86;

public class TestAccount
{
	public static void main(String [] args)
	{
		SavingsAccount.modifyInterestRate(0.04);

		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);


		for (int month = 1; month <= 12; month++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("Monthly interest in month %d%nSaver 1 = %s%n" + 
				"Saver 2 = %s%n", month, saver1, saver2);
		}

		SavingsAccount.modifyInterestRate(0.05);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Values for the next month with a 5%% rate:%nSaver 1 = %s%nSaver = %s%n",
			saver1, saver2);
	}
}