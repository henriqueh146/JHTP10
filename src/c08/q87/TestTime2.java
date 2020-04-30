package c08.q87;

public class TestTime2
{
	public static void main(String [] args)
	{
		Time2 t1 = new Time2(10, 0, 30);
		Time2 t2 = new Time2(10, 0, 59);
		Time2 t3 = new Time2(10, 59, 0);
		Time2 t4 = new Time2(23, 30, 15);
		Time2 t5 = new Time2(23, 59, 59);

		System.out.println("t1\n" + t1.toUniversalString());
		t1.tick();
		System.out.println("t1 after tick\n" + t1.toUniversalString());
		t1.incrementMinute();
		System.out.println("t1 after increment minute\n" + t1.toUniversalString());
		t1.incrementHour();
		System.out.println("t1 after increment hour\n" + t1.toUniversalString());

		System.out.println("t2\n" + t2.toUniversalString());
		t2.tick();
		System.out.println("t2 after tick\n" + t2.toUniversalString());

		System.out.println("t3\n" + t3.toUniversalString());
		t3.incrementMinute();
		System.out.println("t3 after increment minute\n" + t3.toUniversalString());

		System.out.println("t4\n" + t4.toUniversalString());
		t4.incrementHour();
		System.out.println("t4 after increment hour\n" + t4.toUniversalString());

		System.out.println("t5\n" + t5.toUniversalString());
		t5.tick();
		System.out.println("t5 after tick\n" + t5.toUniversalString());
	}
}