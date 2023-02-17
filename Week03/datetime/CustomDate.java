package Week03.datetime;

public class CustomDate {
    private int month, day, year;

    public CustomDate(int month, int day, int year) {
        this.month = month > 0 && month < 13 ? month : 1;
        this.year = year > 0 ? year : 1;
        this.day = day <= getMonthDays(month, isLeapYear(year)) && day > 0 ? day : 1;
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

    public static int getMonthDays(int month, boolean isLeapYear) {
        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear ? 29 : 28;
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
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            default: return "Dec";
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
    }

    public static int toDays(CustomDate date) {
        int monthDays = 0;
        for (int i = 1; i < date.getMonth(); i++) monthDays += getMonthDays(i, false);
        return date.getDay() + monthDays + (date.getYear() * 365) + date.getYear() / 4 - date.getYear() / 100 + date.getYear() / 400;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (toDays(date1) == toDays(date2)) return 0;
        return toDays(date1) < toDays(date2) ? 1 : -1;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%d\n", this.month, this.day, this.year);
    }

    public void displayFormatted() {
        System.out.printf("%02d %s %d\n", this.day, getMonthName(this.month), this.year);
    }

    public int difference(CustomDate date) {
        return Math.abs(toDays(date) - toDays(this));
    }

    public String toString() {
        return String.format("%02d/%02d/%d\n", this.month, this.day, this.year);
    }
}
