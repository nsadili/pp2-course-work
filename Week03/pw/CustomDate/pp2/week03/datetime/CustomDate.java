package pp2.week03.datetime;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Please enter the appropriate number for the month");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Please enter the appropriate number for the day");
        }
        if (year < 0) {
            throw new IllegalArgumentException("Please enter the appropriate number for the year");
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && day > 28) {
            if (day == 29) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    this.month = month;
                    this.day = day;
                    this.year = year;
                } else {
                    throw new IllegalArgumentException("Invalid date");
                }
            } else {
                throw new IllegalArgumentException("Invalid date");
            }
        } else {
            // Note for me : I will back this code's logic
            if (day > daysInMonth[month - 1]) {
                throw new IllegalArgumentException("Invalid date");
            } else {
                this.month = month;
                this.day = day;
                this.year = year;
            }
    }

    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year && date1.month < date2.month && date1.day < date2.day) {
            return 1;
        } else if (date1.year > date2.year && date1.month > date2.month && date1.day > date2.day) {
            return -1;
        } else {
            return 0;
        }

    
}}
