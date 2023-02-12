package pp2.week3.datetime;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {}

    public Date(int y, int m, int d) {
        this.year = y >= 0 ? y : this.year;
        this.month = m >= 1 && m <= 12 ? m : this.month;

        if (d >= 1) {
            boolean validDay = false;
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                validDay = d <= 31;
            } else if (m == 2) {
                validDay = d <= 28 || (d == 29 && isLeapYear());
            } else {
                validDay = d <= 30;
            }

            this.day = validDay ? d : this.day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        this.month = m;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        this.day = d;
    }

    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }

    private static int calculateDifference(Date date1, Date date2) {
        int totalDays1 = calculateTotalDays(date1.getYear(), date1.getMonth(), date1.getDay());
        int totalDays2 = calculateTotalDays(date2.getYear(), date2.getMonth(), date2.getDay());
        return totalDays2 - totalDays1;
    }

    public static int compare(Date date1, Date date2) {
        int diff = calculateDifference(date1, date2);
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
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(year, i);
        }
        totalDays += day;
        return totalDays;
    }

    private static int getDaysInMonth(int year, int month) {
        return month == 2 ? (isLeapYear(year) ? 29 : 28) : 
               (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    public String formattedDisplay() {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
