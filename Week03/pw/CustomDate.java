package pp2.week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid");
        }
        if (year < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        // Code to calculate the difference between two dates in terms of days
        // ...
        return 0;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        // Code to compare two dates and return 1, -1, or 0
        // ...
        return 0;
    }

    public void displayFormatted() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(day + " " + months[month - 1] + " " + year);
    }
}

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 12, 2020);
        CustomDate date2 = new CustomDate(2, 13, 2021);

        System.out.println("Date 1: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println("\nDate 2: ");
        date2.displayDate();
        date2.display();
        System.out.println(date1.difference(date2));
        System.out.println(CustomDate.compare(date1, date2));
    }
}