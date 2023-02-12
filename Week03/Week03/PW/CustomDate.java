public class CustomDate {
    public int month;
    public int day;
    public int year;

    CustomDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month value");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day value");
        }
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year value");
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
            throw new IllegalArgumentException("Invalid month value");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day value");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year value");
        }
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        return day;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        return day;
    }
    public void displayFormatted() {
        String monthStr;
        switch (month) {
            case 1: monthStr = "Jan"; break;
            case 2: monthStr = "Feb"; break;
            case 3: monthStr = "Mar"; break;
            case 4: monthStr = "Apr"; break;
            case 5: monthStr = "May"; break;
            case 6: monthStr = "Jun"; break;
            case 7: monthStr = "Jul"; break;
            case 8: monthStr = "Aug"; break;
            case 9: monthStr = "Sep"; break;
            case 10: monthStr = "Oct"; break;
            case 11: monthStr = "Nov"; break;
            case 12: monthStr = "Dec"; break;
            default: monthStr = "Invalid"; break;
        }
        System.out.println(day + " " + monthStr + " " + year);
    }
}