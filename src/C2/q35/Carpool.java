package c02.q35;

import java.util.Scanner;


public class Carpool
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		/*
		Input:
			Total kilometers per day
			gas price per liter
			Kilometers per liter
			Parking tax per day
			Toll per day
		*/

		System.out.println("Enter the total of kilometers per day:");
		double dailyKm = input.nextDouble();

		System.out.println("Enter the gas price per liter:");
		double gasPrice = input.nextDouble();

		System.out.println("Enter the kilometers per liter:");
		double kmPerL = input.nextDouble();

		System.out.println("Enter the parking tax per day:");
		double parking = input.nextDouble();

		System.out.println("Enter the total toll per day:");
		double toll = input.nextDouble();

		/*
		Output:
			Daily cost of driving
		*/

		double dailyCost = dailyKm / kmPerL * gasPrice + parking + toll;

		System.out.printf("Your daily cost is %.2f$.%n", dailyCost);

	}
}