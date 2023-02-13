public class CustomDate {
 
    private int day;
    private int month;
    private int year;

    CustomDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Such date does not exist!");
            return;
        }

        if (day < 1 || day > 31) {
            System.out.println("Such date does not exist!");
            return;
        }

        if (month == 2 || day > 29) {
            System.out.println("Such date does not exist!");
            return;
        }

        if (!isLeapYear(year) && month == 2 && day > 28) {
            System.out.println("Such date does not exist!");
            return;
        }

        if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Such date does not exist!");
            return;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", month, day, year);
    }

    public int difference(CustomDate date) {
        return Math.abs(this.howManyDaysTill() - date.howManyDaysTill());
        // Finds total days up to the given date and then calculates the difference
    }

    public int howManyDaysTill() {
        int totalDays = 0;
        totalDays += 365 * (this.year - 1);
        totalDays += (this.month - 1) * 31 + this.day;

        // I asssume every year has 365 days and every month has 31 days.
        // To be exact, this method needs to consider leap year cases and also
        // months, such as April, February June, where number of days is less than 365

        return totalDays;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year > date2.year) {
            return -1;
        }
        if (date1.year < date2.year) {
            return 1;
        }

        if (date1.month > date2.month) {
            return -1;
        }
        if (date1.month < date2.month) {
            return 1;
        }

        if (date1.day > date2.day) {
            return -1;
        }
        if (date1.day < date2.day) {
            return 1;
        }

        return 0;

    }

    public void displayFormatted() {
        String curMonth;

        switch (this.month) {
            case 1:
                curMonth = "Jan";
                break;
            case 2:
                curMonth = "Feb";
                break;
            case 3:
                curMonth = "Mar";
                break;
            case 4:
                curMonth = "Apr";
                break;
            case 5:
                curMonth = "May";
                break;
            case 6:
                curMonth = "Jun";
                break;
            case 7:
                curMonth = "Jul";
                break;
            case 8:
                curMonth = "Aug";
                break;
            case 9:
                curMonth = "Sep";
                break;
            case 10:
                curMonth = "Oct";
                break;
            case 11:
                curMonth = "Nov";
                break;
            case 12:
                curMonth = "Dec";
                break;
            default:
                curMonth = "Error";
                break;
        }

        System.out.printf("%d %s %d", this.day, curMonth, this.year);

    }

}

