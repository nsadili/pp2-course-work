package datetime;

public class CustomTimeMain {

	public static void main(String[] args) {
		CustomTime customTime = new CustomTime(16, 30, 55);
		System.out.println("Custom time: " + customTime.toStandardString());
	}

}
