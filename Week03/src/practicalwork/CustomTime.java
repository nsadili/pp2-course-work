package practicalwork;

public class CustomTime {
	private int hour;
	private int minute;
	private int second;

	public CustomTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toStandardString() {
		String amOrPm = "AM";
		if (hour >= 12) {
			hour = hour % 12;
			amOrPm = "PM";
		}
		if (hour == 0) {
			hour = 12;
		}
		return String.format("%d:%02d:%02d %s", hour, minute, second, amOrPm);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}