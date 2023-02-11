package pp2.week3.datetime;

public class CustomDate {

    private int day, month, year;

    public CustomDate(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && (day > 0 && day <= 31)) {
            this.day = day;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 0 && day <= 30)) {
            this.day = day;
        } else {
            if ((year % 4 == 0) && (day > 0 && day <= 29)) {
                this.day = day;

            } else if (day > 0 && day <= 28) {
                this.day = day;
            }
        }

        if (month > 0 && month <= 12) {
            this.month = month;
        }
        this.year = year;
    }

    public int difference(CustomDate date) {
        if (this.year == date.year && this.month == date.month) {
            return Math.abs(this.day - date.day);
        }
        if (this.year == date.year) {
            

        }
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year == date2.year && date1.month == date2.month) {
            if (date1.day > date2.day)
                return -1;
            else if (date1.day < date2.day)
                return 1;
            else
                return 0;

        }

        else if (date1.year == date2.year) {
            if (date1.month > date2.month)
                return -1;
            else if (date1.month < date2.month)
                return 1;
            else
                return 0;
        }

        else {
            if (date1.year > date2.year)
                return -1;
            else if (date1.year < date2.year)
                return 1;
            else
                return 0;

        }

    }

    public void displayFormatted() {
        switch (month) {
            case 1:
                System.out.printf("%d Jan %d", day, year);
            case 2:
                System.out.printf("%d Feb %d", day, year);
            case 3:
                System.out.printf("%d March %d", day, year);
            case 4:
                System.out.printf("%d Apr %d", day, year);
            case 5:
                System.out.printf("%d May %d", day, year);
            case 6:
                System.out.printf("%d June %d", day, year);
            case 7:
                System.out.printf("%d July %d", day, year);
            case 8:
                System.out.printf("%d Aug %d", day, year);
            case 9:
                System.out.printf("%d Sep %d", day, year);
            case 10:
                System.out.printf("%d Oct %d", day, year);
            case 11:
                System.out.printf("%d Nov %d", day, year);
            case 12:
                System.out.printf("%d Dec %d", day, year);

        }

    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", month, day, year);
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

}
