package pp2.week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid date!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(day, month, year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        int days1 = calculateDays(this);
        int days2 = calculateDays(date);
        return days2 - days1;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        int days1 = calculateDays(date1);
        int days2 = calculateDays(date2);

        if (days1 < days2) {
            return 1;
        } else if (days1 > days2) {
            return -1;
        } else {
            return 0;
        }
    }

    public void displayFormatted() {
        String monthName = getMonthName(month);
        System.out.printf("%02d %s %04d\n", day, monthName, year);
    }

    private boolean isValidDate(int month, int day, int year) {
        if (isValidMonth(month) && isValidDay(day, month, year) && isValidYear(year)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isValidDay(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            if (month == 2) {
                return isLeapYear(year) ? day <= 29 : day <= 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day <= 30;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean isValidYear(int year) {
        return year >= 1;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int calculateDays(CustomDate date) {
        int totalDays = date.day;
        int[] daysInMonth = { 31, isLeapYear(date.year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 1; i < date.month; i++) {
            totalDays += daysInMonth[i - 1];
        }

        totalDays += (date.year - 1) * 365 + countLeapYears(date.year);

        return totalDays;
    }

    private static int countLeapYears(int year) {
        int count = year / 4 - year / 100 + year / 400;
        return count;
    }

    private String getMonthName(int month) {
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        return monthNames[month - 1];
    }
}