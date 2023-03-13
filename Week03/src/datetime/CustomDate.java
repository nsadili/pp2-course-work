package datetime;

public class CustomDate {
	private int day;
	private int month;
	private int year;

	public CustomDate(int day, int month, int year) {
		if (!isValidDate(day, month, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (!isValidDate(day, this.month, this.year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (!isValidDate(this.day, month, this.year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (!isValidDate(this.day, this.month, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.year = year;
	}

	private boolean isValidDate(int day, int month, int year) {
		if (month < 1 || month > 12) {
			return false;
		}
		int daysInMonth = getDaysInMonth(month, year);
		if (day < 1 || day > daysInMonth) {
			return false;
		}
		return true;
	}

	private int getDaysInMonth(int month, int year) {
		switch (month) {
		case 2:
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	private boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", day, month, year);
	}

	public static int compare(CustomDate d1, CustomDate d2) {
		if (d1.year < d2.year) {
			return -1;
			
		} else if (d1.year > d2.year) {
			
			return 1;
			
		} else if (d1.month < d2.month) {
			
			return -1;
			
		} else if (d1.month > d2.month) {
			
			return 1;
			
		} else if (d1.day < d2.day) {
			
			return -1;
			
		} else if (d1.day > d2.day) {
			
			return 1;
			
		} else {
			
			return 0;
			
		}
	}
}
