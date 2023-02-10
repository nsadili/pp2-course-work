package pp2.week3.datetime;

public class CustomDate {
    private int year;
    private int month;
    private int day;

    CustomDate() {
    }

    public CustomDate(int year, int month, int day) {
        this.year = year >= 0 ? year : this.year;
        this.month = month >= 0 && month <= 12 ? month : this.month;

        if (day >= 0) {
            boolean isValidDay = false;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 31) {
                isValidDay = day <= 31;
            } else if (month == 2) {
                isValidDay = day <= 28 || (day == 29 && isLeapYear());
            } else {
                isValidDay = day <= 30;
            }

            this.day = isValidDay ? day : this.day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    private static int difference(CustomDate date1, CustomDate date2) {
        int totalDays1 = calculateTotalDays(date1.getYear(), date1.getMonth(), date1.getDay());
        int totalDays2 = calculateTotalDays(date2.getYear(), date2.getMonth(), date2.getDay());
        return totalDays2 - totalDays1;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        long diff = difference(date1, date2);
        if (diff < 0) {
            return 1;
        } else if (diff > 0) {
            return -1;
        } else {
            return 0;
        }
    }

    private static int calculateTotalDays(int year, int month, int day) {
        int totalDays = 0;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(year, i);
        }
        totalDays += day;
        return totalDays;
    }

    private static int getDaysInMonth(int year, int month) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public String displayFormatted() {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        return day + " " + months[month - 1] + " " + year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    private boolean isLeapYear() {
        return (this.year % 400 == 0) || ((this.year % 4 == 0) && (this.year % 100 != 0));
    }
}