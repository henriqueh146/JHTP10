package c03.q16;

public class HeartRates
{
	private String name;
	private String lastName;
	private int day, month, year;

	public HeartRates(String name, String lastName, int day, int month, int year)
	{
		this.name = name;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public int getDay()
	{
		return day;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getMonth()
	{
		return month;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getYear()
	{
		return year;
	}

	public int calculateAge(int day, int month, int year)
	{
		if(month > this.month)
			return year - this.year;
		if(month < this.month)
			return year - this.year - 1;
		if(day >= this.day)
			return year - this.year;

		return year - this.year - 1;
	}

	public double maxHeartRate(int day, int month, int year)
	{
		return 220.0 - calculateAge(day, month, year);
	}
	/*
	Target Heart Rate is between 50% and 85% of the max rate. 
	In this chapter and in the previous is not given any way to return more than one value to the caller. 
	So, I decided to return the maximum value and calculate the minimum value of the target rate at the caller.
	*/
	public double targetRate(int day, int month, int year)
	{
		return maxHeartRate(day, month, year) * 0.85;
	}
}