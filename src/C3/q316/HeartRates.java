package c03.q316;

// Segundo a American Heart Association
// (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular a frequência cardíaca
// máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
// máxima.

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
// A classe também deve incluir um método
// que calcule e retorne a idade (em anos), 

	public 

	//um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
// cardíaca alvo da pessoa
}