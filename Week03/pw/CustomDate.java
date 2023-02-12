public class CustomDate {

    
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {

            this.month = month;    
            this.day = day;  
            this.year = year;
       
        }



    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

   public int difference(CustomDate date) {
    int difference = 0;
    int dayInMonth1 = this.year * 365 + this.month * 30 + this.day;
    int dayInMonth2 = date.year * 365 + date.month * 30 + date.day;
    difference = dayInMonth2 - dayInMonth1;
    return difference;
}

    public static int compare(CustomDate date1, CustomDate date2) {
    int result = 0;
    if (date1.year < date2.year) {
        result = 1;
    } else if (date1.year > date2.year) {
        result = -1;
    } else if (date1.month < date2.month) {
        result = 1;
    } else if (date1.month > date2.month) {
        result = -1;
    } else if (date1.day < date2.day) {
        result = 1;
    } else if (date1.day > date2.day) {
        result = -1;
    }
    return result;
    }
    public void displayFormatted() {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(day + " " + monthNames[month - 1] + " " + year);
    }
}
