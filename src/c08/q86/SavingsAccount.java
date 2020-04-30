package c08.q86;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;

public class SavingsAccount
{
	public static BigDecimal annualInterestRate;

	private BigDecimal savingsBalance;

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = BigDecimal.valueOf(savingsBalance);
	}

	public static void modifyInterestRate(double newRate)
	{
		annualInterestRate = BigDecimal.valueOf(newRate);
	}

	public BigDecimal calculateMonthlyInterest()
	{
		savingsBalance = savingsBalance.add(savingsBalance.multiply(
			annualInterestRate.divide(BigDecimal.valueOf(12.0), MathContext.DECIMAL128)));
		return savingsBalance;
	}

	public String toString()
	{
		return String.format("Savings Balance: %s", NumberFormat.getCurrencyInstance().format(savingsBalance));
	}
	
}