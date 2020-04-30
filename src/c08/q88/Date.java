package c08.q88;

public class Date
{
	private final int YEAR_MIN = 2000, YEAR_MAX = 2100;
	
	private int month;
	private int day;
	private int year;

	private static final int[] daysPerMonth =
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Date(int month, int day, int year)
	{
		if(month < 1 || month > 12)
			throw new IllegalArgumentException("month " + month + " must be 1-12");

		if(day < 1 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

		if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out of range for the specified month and year");
		if(year < YEAR_MIN || year > YEAR_MAX)
			throw new IllegalArgumentException("year must be " + YEAR_MIN + "-" + YEAR_MAX);

		this.month = month;
		this.day = day;
		this.year = year;

		System.out.printf("Date object constructor for date %s%n", this);
	}

	public void nextDay()
	{

		if(day == 31 && month == 12 && year == YEAR_MAX)
		{
			System.out.printf("Maximum date value (12-31-%d) already reached.%n", YEAR_MAX);
			return ;
		}
		/*
		Short-circuit boolean verification (it doesn't evaluate all the operands always): 
			the 'day' will be evaluated only if the month is February because in AND opperations 
			all the expressions must be true for the whole expression to be true; the year will
			be verified if it is a 'leap' year only if day is 28 AND month is Ferbuary.
		Thus, the code in the if statement will be executed only if it is  Ferbuary AND 2 AND it is a leap
		year.
		*/
		if(month == 2 && day == 28 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
		{
			day++;
			return;
		}
		if(day >= daysPerMonth[month]) // >= used to include February 29, which is greater than daysPerMonth[2]
		{
			nextMonth();
			day=1;
		}
		else
		{
			day++;
		}
	}

	private void nextMonth()
	{
		if(month == 12 && year < YEAR_MAX)
		{
			nextYear();
			month = 1;
		}
		else
			month++;
	}

	private void nextYear()
	{
		if(year == YEAR_MAX)
			System.out.println("Year maximum value is " + YEAR_MAX + ".");
		else
			year++;
	}

	public String toString()
	{
		return String.format("%d/%d/%d", month, day, year);
	}

	
}