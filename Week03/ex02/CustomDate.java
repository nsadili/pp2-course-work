public class CustomDate {
    
    private static final boolean Leap = false;
    private int month;
    private int day;
    private int year;
    String monthString = "";
    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public CustomDate() {
        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
        }
        else{ 
            this.month = month;
        }
        this.day = day;
        this.year = year;

    }

    public void setMonth(int month) {
        this.month = month;
    }


    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private static boolean Leap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }


    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
    public String displayFormatted(){
        switch(month){
            case 1: monthString = "Jan";
            break;
            case 2: monthString = "Feb";
            break;
            case 3: monthString = "Mar";
            break;
            case 4: monthString = "Apr";
            break;
            case 5: monthString = "May";
            break;
            case 6: monthString = "Jun";
            break;
            case 7: monthString = "Jul";
            break;
            case 8: monthString = "Aug";
            break;
            case 9: monthString = "Sep";
            break;
            case 10: monthString = "Oct";
            break;
            case 11: monthString = "Nov";
            break;
            case 12: monthString = "Dec";
            break;
        }
        return day + " " + monthString + " " + year;
    }
    public int difference(CustomDate date) {
        int days1 = this.year * 365 + this.day;
        for (int i = 0; i < this.month - 1; i++) {
            days1 += daysInMonth[i];
        }
        if (Leap(this.year) && this.month > 2) {
            days1++;
        }

        int days2 = date.year * 365 + date.day;
        for (int i = 0; i < date.month - 1; i++) {
            days2 += daysInMonth[i];
        }
        if (Leap(date.year) && date.month > 2) {
            days2++;
        }

        return Math.abs(days1 - days2);
    }
    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        }else if(date1.year > date2.year) {
            return -1;
        } else {
            if(date1.month < date2.month) {
                return 1;
            }else if(date1.month > date2.month) {
                return -1;
            }else {
                if(date1.day < date2.day) {
                    return 1;
                }else if(date1.day > date2.day) {
                    return -1;
                }else {
                    return 0;
                }
            }
        }
    }
}
