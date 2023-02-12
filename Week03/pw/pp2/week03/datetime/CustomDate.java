package pp2.week03.datetime;

public class CustomDate{
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year){
       this.month = month;
       this.day = day;
       this.year = year;
       if(month <= 0 || month > 12){
        System.out.println("Invalid month");

       } 
       if (day < 1 || day > 31) {
        System.out.println("Invalid day");
        if (year < 0) {
            System.out.println("Invalid year");
          }
      }
      if (month == 2) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (day > 29) {
                System.out.println("Invalid day for February");
            }
        } else {
            if (day > 28) {
                System.out.println("Invalid day for February");
            }
        }
    }

    }

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
    
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
     public int difference(CustomDate date){
        int x = 0;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int y = this.year; y < date.year; y++){
            if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) {
                x += 366;
            } else {
                x += 365;
            } 
        }
        for (int n = 0; n < 12; n++) {
            if (n < this.month - 1 || n > date.month - 1) {
                x += daysInMonth[n];
            }
   
        }
        x -= this.day;
    x += date.day;

    return x;
}
public static int compare(CustomDate date1, CustomDate date2){
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
public void displayFormatted(){
    String monthName;
    switch (this.month) {
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
            case 10:
                monthName = "Oct";
                break;
            case 11:
            monthName = "Nov";
            break;
        case 12:
            monthName = "Dec";
            break;
            default:
            monthName = "Invalid";
    }
    System.out.println(this.day + " " + monthName + " " + this.year);
}
}


        
    

  
   

