package c08.q810;

public enum TrafficLight
{
	RED (1),
	GREEN (2), 
	YELLOW (3);

	private final int timeOfLight;

	TrafficLight(int timeOfLight)
	{
		this.timeOfLight = timeOfLight;
	}

	public int getTimeOfLight()
	{
		return timeOfLight;
	}
}