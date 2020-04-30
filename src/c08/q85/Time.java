//Question 8.5
package c08.q85;

public class Time
{

	private int time;

	public Time()
	{
		this(0, 0, 0);
	}

	public Time(int hour)
	{
		this(hour, 0, 0);
	}

	public Time(int hour, int minute)
	{
		this(hour, minute, 0);
	}

	public Time(int hour, int minute, int second)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		if(minute < 0 || minute >=60)
			throw new IllegalArgumentException("minute must be 0-59");
		if(second < 0 || second >=60)
			throw new IllegalArgumentException("second must be 0-59");

		this.time = hour * 3600 + minute * 60 + second;
	}

	public Time(Time time)
	{
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setHour(int hour)
	{
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		time += (hour - getHour()) * 3600;
	}

	public void setMinute(int minute)
	{
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		time += (minute - getMinute()) * 60;
	}

	public void setSecond(int second)
	{
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		time = (second - getSecond());
	}

	public int getHour()
	{
		return time / 3600;
	}

	public int getMinute()
	{
		return (time % 3600) / 60;
	}

	public int getSecond()
	{
		return (time % 3600) % 60;
	}

	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String toString()
	{
		return String.format("%d:%02d:%02d %s", (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}