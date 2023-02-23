package Ex03;

class CustomDate {
    private int month, day, year;


    public CustomDate(int month, int day, int year) {
        this.month = month > 0 && month < 13 ? month : 1;
        this.year = year > 0 ? year : 1;
        this.day = day <= getMonthDays(month, LeapYear(year)) && day > 0 ? day : 1;
    }

    private boolean LeapYear(int year2) {
        return false;
    }

    boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

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
        System.out.println(month + "/" + day + "/" + year);
    }

    public void displayFormatted() {
        System.out.printf("%s %02d %d\n", getMonthNumber(this.month), this.day, this.year);
    }

    public static int getMonthDays(int month, boolean LeapYear) {
        switch (month) {
            case 1: return 31;
            case 2: return LeapYear ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            default: return 31;
        }
    }

   
    public static String getMonthNumber(int month) {
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            default: return "Dec";
        }
    }

    public static int Day(CustomDate date) {
        int monthDays = 0;
        for (int i = 1; i < date.getMonth(); i++) monthDays += getMonthDays(i, false);
        return date.getDay() + monthDays + (date.getYear() * 365) + date.getYear() / 4 - date.getYear() / 100 + date.getYear() / 400;
    }


    public int difference(CustomDate date) {
        return Math.abs(Day(date) - Day(this));
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else if (date1.month < date2.month) {
            return 1;
        } else if (date1.month > date2.month) {
            return -1;
        } else if (date1.day < date2.day) {
            return 1;
        } else if (date1.day > date2.day) {
            return -1;
        } else {
            return 0;
        }
    }















}

    
  
     