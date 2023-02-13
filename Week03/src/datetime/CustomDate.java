package week03.src.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int daysInMonth = getDaysInMonth(month, year);
        if (day < 1 || day > daysInMonth) {
            return false;
        } else {
            return true;
        }

    }

    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            // case numbers show the number of months
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year && date1.month < date2.month && date1.day < date2.day) {
            return 1;
        } else if (date1.year > date2.year && date1.month > date2.month && date1.day > date2.day) {
            return -1;
        } else {
            return 0;
        }

    }
}