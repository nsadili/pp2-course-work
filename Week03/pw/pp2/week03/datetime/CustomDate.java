package pp2.week03.datetime;

public class CustomDate{

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = month > 0 && month < 13 ? month : 1;
        this.year = year > 0 ? year : 1;
        this.day = day <= getMonthDays(month, IsLeapYear(year)) && day > 0 ? day : 1;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayFormatted() {
        System.out.printf("%s %02d %d\n", getMonthNumber(this.month), this.day, this.year);
    }
    public static int getMonthDays(int month, boolean IsLeapYear) {
        switch (month) {
            case 1: return 31;
            case 2: return IsLeapYear ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            default: return 31;
        }
    }
    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            default: return "December";
        }
    }
    public static int Day(CustomDate date) {
        int monthDays = 0;
        for (int i = 1; i < date.getMonth(); i++) monthDays += getMonthDays(i, false);
        return date.getDay() + monthDays + (date.getYear() * 365) + date.getYear() / 4 - date.getYear() / 100 + date.getYear() / 400;
    }
    public int difference(CustomDate date) {
        return Math.abs(Day(date) - Day(this));
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
}