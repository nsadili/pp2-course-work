package pp2.week03.datetime;

public class CustomDate {
	private int dayOfDate;
	private int monthOfDate;
	private int year;

	public CustomDate(int dayOfDate, int monthOfDate, int year) {
		if (!isValidDate(dayOfDate, monthOfDate, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.dayOfDate = dayOfDate;
		this.monthOfDate = monthOfDate;
		this.year = year;
	}

	public int getDay() {
		return dayOfDate;
	}

	public void setDay(int dayOfDate) {
		if (!isValidDate(dayOfDate, this.monthOfDate, this.year)) {
			throw new IllegalArgumentException("Date is not true!");
		}
		this.dayOfDate = dayOfDate;
	}

	public int getMonth() {
		return monthOfDate;
	}

	public void setMonth(int month) {
		if (!isValidDate(this.dayOfDate, monthOfDate, this.year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.monthOfDate = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (!isValidDate(this.dayOfDate, this.monthOfDate, year)) {
			throw new IllegalArgumentException("Invalid date");
		}
		this.year = year;
	}

	private boolean isValidDate(int dayOfDate, int monthOfDate, int year) {
		if (monthOfDate < 1 || monthOfDate > 12) {
			return false;
		}
		int daysInMonth = getDaysInMonth(monthOfDate, year);
		if (dayOfDate < 1 || dayOfDate > daysInMonth) {
			return false;
		}
		return true;
	}

	private int getDaysInMonth(int monthOfDate, int year) {
		switch (monthOfDate) {
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
		return String.format("%02d/%02d/%04d", dayOfDate, monthOfDate, year);
	}

	public static int compare(CustomDate d1, CustomDate d2) {
		if (d1.year < d2.year) {
			return -1;
			
		} else if (d1.year > d2.year) {
			
			return 1;
			
		} else if (d1.monthOfDate < d2.monthOfDate) {
			
			return -1;
			
		} else if (d1.monthOfDate > d2.monthOfDate) {
			
			return 1;
			
		} else if (d1.dayOfDate < d2.dayOfDate) {
			
			return -1;
			
		} else if (d1.dayOfDate > d2.dayOfDate) {
			
			return 1;
			
		} else {
			
			return 0;
			
		}
	}
}
