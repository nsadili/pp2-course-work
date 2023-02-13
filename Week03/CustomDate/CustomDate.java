package Week03.CustomDate;

public class CustomDate {
    
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            System.out.println("Invalid Date!");
        }

        this.month = month;
        this.year = year;
        this.day = day;
    }

    // Setters and Getters

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

    // .........
    // Check if it is Leap Year
    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Check if it is Valid date or not
    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }

    // To display date in a proper way.

    public void displayFormatted() {
        String monthStr;
        switch (month) {
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
                monthStr = "Invalid month";
                break;
        }
        System.out.println(day + "/" + monthStr + "/" + year);
    }

    // Code to calculate the difference between two dates

    public int difference(CustomDate date) {

        return 0;
    }

    // Code to compare two dates
    public static int compare(CustomDate date1, CustomDate date2) {

        return 0;
    }
}
