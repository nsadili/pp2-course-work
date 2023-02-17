package pp22.week03.datetime;

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
            throw new IllegalArgumentException("Invalid date input!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidDate(month, this.day, this.year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month input!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDate(this.month, day, this.year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day input!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidDate(this.month, this.day, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year input!");
        }
    }

    public String displayDate() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public int difference(CustomDate date) {
        long diffInMillies = Math.abs(this.toMillis() - date.toMillis());
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
        return (int) diffInDays;
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

    public String displayFormatted() {
        String monthStr = "";
        switch (this.month) {
            case 1:
                monthStr = "Jan";
                break;
            case 2:
                monthStr = "Feb";
                break;
            case 3:
                monthStr = "Mar";
                break;
            case 4:
                monthStr = "Apr";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "Jun";
                break;
            case 7:
                monthStr = "Jul";
                break;
            case 8:
                monthStr = "Aug";
                break;
            case 9:
                monthStr = "Sep";
                break;
            case 10:
                monthStr = "Oct";
                break;
            case 11:
                monthStr = "Nov";
                break;
            case 12:
                monthStr = "Dec";
                break;
            default:
                break;
        }
        return this.day + " " + monthStr + " " + this.year;
    }

}