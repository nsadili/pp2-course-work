package Week03.datetime;

public class CustomDate {
    
    private String[] Months = {
    "January", "February", "March", "April",
     "May", "June", "July", "August", "September", 
     "October", "November", "December"};

    private int month;
    private int day;
    private int year;


    public CustomDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setMonth(int month){
        this.month = month;
        if(month < 0 || month > 12) System.out.println("Provided number for month is not appropriate!");
    }
    public int getMonth(){
        return this.month;
    }



    public void setDay(int day){
        this.day = day;
        if(day < 1 || day > 31) System.out.println("Provided number for day is not appropriate!");
    }
    public int getDay(){
        return this.day;
    }


    public void setYear(int year){
        this.year =  year;
        if(year < 0) System.out.println("Provided number for year is not approprate!");
    }
    public int getYear(){
        return this.year;
    }


    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }


    public int difference(CustomDate date){
        int current_date = this.day + this.month*31 + this.year*365;
        int  input_date  = date.day + date.month*31 + date.year*365;
        return current_date - input_date;
    }


    public static int compare(CustomDate date1, CustomDate date2){
        return date1.getYear()  < date2.getYear()  ?  1 :
               date2.getYear()  < date1.getYear()  ? -1 :
               date1.getMonth() < date2.getMonth() ?  1 :
               date2.getMonth() < date1.getMonth() ? -1 :
               date1.getDay()   < date2.getDay()   ?  1 :
               date2.getDay()   < date1.getDay()   ? -1 : 0;
    }


    public void displayFormatted() {
        System.out.println(getDay() + " " + Months[getMonth() - 1] + " " + getYear());
    }

}
