package pp2.week03.datetime;
public class CustomTime {
	private int hourOfTime;
	private int minuteOfTime;
	private int secondOfTime;

	public CustomTime(int hourOfTime, int minuteOfTime, int secondOfTime) {
		this.hourOfTime = hourOfTime;
		this.minuteOfTime = minuteOfTime;
		this.secondOfTime = secondOfTime;
	}

	public int getHour() {
		return hourOfTime;
	}

	public int getMinute() {
		return minuteOfTime;
	}

	public int getSecond() {
		return secondOfTime;
	}

	public void setHour(int hour) {
		this.hourOfTime = hour;
	}

	public void setMinute(int minute) {
		this.minuteOfTime = minute;
	}

	public void setSecond(int second) {
		this.secondOfTime = second;
	}

	public String toStandardString() {
		String am_pm = "AM";
		if (hourOfTime >= 12) {
			hourOfTime = hourOfTime % 12;
			am_pm = "PM";
		}
		if (hourOfTime == 0) {
			hourOfTime = 12;
		}
		return String.format("%d:%02d:%02d %s", hourOfTime, minuteOfTime, secondOfTime, am_pm);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hourOfTime, minuteOfTime, secondOfTime);
	}
}
