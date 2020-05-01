package c03.q16;

import java.util.Scanner;

public class HeartRatesTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first name:");
		String firstName = input.nextLine();

		System.out.println("Enter the last name:");
		String lastName = input.nextLine();

		System.out.println("Enter your birthday (month)");
		int month = input.nextInt();

		System.out.println("Enter your birthday (day)");
		int day = input.nextInt();

		System.out.println("Enter your birthday (year)");
		int year = input.nextInt();

		HeartRates hr = new HeartRates(firstName, lastName, day, month, year);

		System.out.println("Enter the current month");
		int currentMonth = input.nextInt();

		System.out.println("Enter the current day");
		int currentDay = input.nextInt();

		System.out.println("Enter the current year");
		int currentYear = input.nextInt();

		System.out.printf("%nName: %s %s%nBirthday: %d/%d/%d%nAge: %d%nMax heart rate: %.2f%nTarget rate: %.2f to %.2f%n", 
			hr.getName(), hr.getLastName(), hr.getMonth(), hr.getDay(),	hr.getYear(), 
			hr.calculateAge(currentDay, currentMonth, currentYear), hr.maxHeartRate(currentDay, currentMonth, currentYear),
			hr.targetRate(currentDay, currentMonth, currentYear) * 0.5 / 0.85, 
			hr.targetRate(currentDay, currentMonth, currentYear));

	}
}