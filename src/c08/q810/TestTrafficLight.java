package c08.q810;

public class TestTrafficLight
{
	public static void main(String [] args)
	{
		for(TrafficLight tl : TrafficLight.values())
		{
			System.out.printf("%-5s\t%d%n", tl, tl.getTimeOfLight());
		}
	}
}