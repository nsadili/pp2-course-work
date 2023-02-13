package pp2.week03.geometry;
public class CustomDate {
    private int month;
    private int day;
    private int year;
    public char[] displayDate;

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.print("Invalid month value.");
        }
        this.month = month;
    }
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.print("Invalid day value.");
        }
        this.day = day;
    }
    public void setYear(int year) {
        if (year < 0) {
            System.out.print("Invalid year value.");
        }
        this.year = year;
    }
    
    public CustomDate(int month, int day, int year){

        if (month < 1 || month > 12) {
            System.out.print("Invalid month value.");
        }
        if (day < 1 || day > 31) {
            System.out.print("Invalid day value.");
        }
        if (year < 0) {
            System.out.print("Invalid year value.");
        }
        this.month = month;
        this.day = day;
        this.year = year;
   }

   public void displayDate() {
    System.out.println(month + "/" + day + "/" + year);
}
// if leap year
public boolean isLeapYear(int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        return true;
    } else {
        return false;
    }
}

public int difference(CustomDate date) {
return 0;
    //return Math.abs(this.howManyDaysTill() - date.howManyDaysTill());
}

//public int howManyDaysTill() {
  //  int totalDays = 0;
//    totalDays += 365 * (this.year - 1);
  //  totalDays += (this.month - 1) * 31 + this.day;

 //   return totalDays;
//}
//commented codes I took from my friend 
// Honestly I do not understand how to write difference method

public static int compare(CustomDate date1, CustomDate date2) {
    if (date1.getYear() < date2.getYear()) return 1;
        if (date1.getYear() > date2.getYear()) return -1;

        if (date1.getMonth() < date2.getMonth()) return 1;
        if (date1.getMonth() > date2.getMonth()) return -1;

        if (date1.getDay() < date2.getDay()) return 1;
        if (date1.getDay() > date2.getDay()) return -1;
    return 0;
}

public void displayFormatted() {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    System.out.println(day + " " + months[month - 1] + " " + year);
}
//switch(month){ case 1 case 2 case 3 ...... can also be used}

}

