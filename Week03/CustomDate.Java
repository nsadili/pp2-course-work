public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(month, this.day, this.year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month.");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.month, day, this.year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(this.month, this.day, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year.");
        }
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }

    public int difference(CustomDate date) {
        long time1 = getTime();
        long time2 = date.getTime();
        long difference = time1 - time2;
        return (int) (difference / (1000 * 60 * 60 * 24));
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else {
            if (date1.month < date2.month) {
                return 1;
            } else if (date1.month > date2.month) {
                return -1;
            } else {
                if (date1.day < date2.day) {
                    return 1;
                } else if (date1.day > date2.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public void displayFormatted() {
        String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.printf("%02d %s %d%n", day, months[month], year);
    }

    private boolean isValidDate(int month, int day, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    private int daysInMonth(int month, int year) {
        int days;
        switch (month) {
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
    }
}