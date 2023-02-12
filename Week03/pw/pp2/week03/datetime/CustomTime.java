package pp2.week03.datetime;
public class CustomTime {

    private int hour;
    private int minute;
    private int second;


public CustomTime(int hour, int minute, int second) {

    this.hour = hour;
    this.minute = minute;
    this.second = second;
}

public CustomTime() {
    
    this(0, 0, 0);
}


    public CustomTime(int hour) {

        this(hour, 0, 0);
    }

    public CustomTime(int hour, int minute) {

        this(hour, minute, 0);
    }

    public CustomTime(CustomTime time) {

       this.hour = hour;
       this.minute = minute;
       this.second = second;

    }

    public int getHour() {
        return hour;
    }

    /* public void setHour(int hour) {
        this.hour = hour;
    }
    */

    public int getMinute() {
        return minute;
    }

/* public void setMinute(int minute) {
        this.minute = minute;
    }
    */

    public int getSecond() {
        return second;
    }

   /* public void setSecond(int second) {
        this.second = second;
    }
    */

    public String toUniversalString() {


        //String[] h = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
        //String[] m = {""};
        //String[] s = {""};

       // for (int h = 0; h < 25; h++) {


            System.out.print("The time: " + getHour() + ":" + getMinute() + ":" + getSecond());

       // }
       return null;

       // return CustomTime.hour ":" CustomTime.minute ":" CustomTime.second;

    }


    public String toStandString() {


        if (getHour() < 13) 
            System.out.print("The time: " + getHour() + ":" + getMinute() + ":" + getSecond() + "AM");
        else
        System.out.print("The time: " + getHour() + ":" + getMinute() + ":" + getSecond() + "PM");

        

        return null;

    }





}