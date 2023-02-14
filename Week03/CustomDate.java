package Week03;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Error");
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            System.out.println("Error");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private static int daysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month value: " + month);
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > daysInMonth(month, year)) {
            System.out.println("Invalid day value: " + day);}
        this.day = day;
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (day == 29 && month == 2 && !isLeapYear(year)) {
            System.out.println("Invalid year value: " + year);
        }
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }

    public int difference(CustomDate date) {
        long millisThis = this.toMillis();
        long millisOther = date.toMillis();
        long diffMillis = Math.abs(millisThis - millisOther);
        return (int) (diffMillis / (1000 * 60 * 60 * 24));
    }

    private long toMillis() {
        return java.time.LocalDate.of(year, month, day).toEpochDay() * 86400000L;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else if (date1.month < date2.month) {
            return 1;
        } else if (date1.month > date2.month) {
            return -1;
        } else if (date1.day < date2.day) {
            return 1;
        } else if (date1.day > date2.day) {
            return -1;
        } else {
            return 0;
        }
    }

    public void displayFormatted() {
        String monthName = java.time.Month.of(month).name().substring(0, 3);
        System.out.printf("%02d %s %04d%n", day, monthName, year);
    }
}