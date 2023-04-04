package datetime;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if(!isLeap() && month == 2 && day > 28) {
            System.out.println("Enter a valid date.");
        }
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
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public int difference(CustomDate date) {
        return (this.year * 365 + this.month * 30 + this.day) - (date.getYear() * 365 + date.getMonth() * 30 + date.getDay());
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if(date1.year < date2.year) {
            return 1;
        }
        else
        if(date1.year > date2.year) {
            return -1;
        }
        else {
            if(date1.month < date2.month) {
                return 1;
            }
            else
            if(date1.month > date2.month) {
                return -1;
            }
            else {
                if(date1.day < date2.day) {
                    return 1;
                }
                else
                if(date1.day > date2.day) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }

    public void displayFormatted() {
        String monthName = "";
        switch(this.month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:;
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
        }
        System.out.println(this.day + " " + monthName + " " + this.year);
    }

    private boolean isLeap() {
        if(this.year % 400 == 0) {
            return true;
        }
        if(this.year % 100 == 0) {
            return false;
        }
        if(this.year % 4 == 0) {
            return true;
        }
        return false;
    }
}