package Week03.datetime;

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

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", month, day, year);
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
                System.out.printf("%d January %d\n", day, year);
                break;
            case 2:
                System.out.printf("%d Febuary %d\n", day, year);
                break;
            case 3:
                System.out.printf("%d March %d\n", day, year);
                break;
            case 4:
                System.out.printf("%d April %d\n", day, year);
                break;
            case 5:
                System.out.printf("%d May %d\n", day, year);
                break;
            case 6:
                System.out.printf("%d June %d\n", day, year);
                break;
            case 7:
                System.out.printf("%d July %d\n", day, year);
                break;
            case 8:
                System.out.printf("%d August %d\n", day, year);
                break;
            case 9:
                System.out.printf("%d September %d\n", day, year);
                break;
            case 10:
                System.out.printf("%d October %d\n", day, year);
                break;
            case 11:
                System.out.printf("%d November %d\n", day, year);
                break;
            case 12:
                System.out.printf("%d December %d\n", day, year);

        }

    }
}