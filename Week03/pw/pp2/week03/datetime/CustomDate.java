package pp2.week03.datetime;
public class CustomDate {
    
    private int month;
    private int day;
    private int year;
    


    public CustomDate(int month, int day, int year) {
        
        this.month = month;
        this.day = day;
        this.year = year;
        // consider a leap year ???
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
        System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
    }

    public int difference (CustomDate date) {
        int days = 0;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // add days for years
        for (int i = this.year; i < date.getYear(); i++) {
            if ((i % 4 == 0) && (i % 400 == 0)) {

               // System.out.println("Leap year");
                days += 366;

            } else 

            {
                //System.out.println("Not Leap year");
                days += 365;

            }
        }

        // add days for months

        for (int i = 0; i < date.getMonth() - 1; i++) {
            days += monthDays[i];
        }

        for (int i = 0; i < this.month - 1; i++) {
            days -= monthDays[i];
        }

        //add days for days

        days += (date.getDay() - this.day);

       // this.day = days;
        return days;
    }
    
    public static int compare(CustomDate date1, CustomDate date2) {

        
        if ((date1.year == date2.year && date1.month == date2.month && date1.day < date2.day) || date1.year == date2.year && date1.month < date2.month || date1.year < date2.year)
        return 1;
        else
        if ((date1.year == date2.year && date1.month == date2.month && date1.day > date2.day) || date1.year == date2.year && date1.month > date2.month || date1.year > date2.year)
        return -1;
        else
        return 0;      
        
    }

    public void displayFormatted() {

        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      
       
        System.out.println(getDay() + " " + months[getMonth() - 1] + " " + this.getYear());

        

        

    }
}