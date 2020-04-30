package c08.q88;

/*
Tests nextDay. Cases:
	a) nextDay until the next month;
	b) nextDay until the next year;
*/

public class TestDate
{
	public static void main(String [] args)
	{
		Date date = new Date(1, 1, 2020); // January 1, 2020
		//Until Feburary:
		for(int i = 0; i <= 31; i++)
		{
			System.out.println(date);
			date.nextDay();
		}

		//Until 2021
		while(!date.toString().equals("1/1/2021"))
		{
			System.out.println(date);
			date.nextDay();
		}
	}
}