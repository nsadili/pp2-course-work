package pp2.week03.datetime;

public class CustomTimeTest {

	public static void main(String[] args) {
		CustomTime customTime = new CustomTime(16, 30, 55);
		System.out.println("Custom time: " + customTime.toStandardString());
	}

}
