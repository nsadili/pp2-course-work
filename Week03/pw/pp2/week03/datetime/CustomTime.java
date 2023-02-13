package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public CustomTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public CustomTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    
    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        String min;
        if (minute < 10) {
            min = "0" + minute;
        } else {
            min = Integer.toString(minute);
        }
        String sec;
        if (second < 10) {
            sec = "0" + second;
        } else {
            sec= Integer.toString(second);
        }
        return hour + ":" + min + ":" + sec;
    }
    
    public String toStandardString() {
        String a;
        if (hour < 12) {
            a = "AM";
        } else {
            a = "PM";
        }
        String min;
        if (minute < 10) {
            min = "0" + minute;
        } else {
            min = Integer.toString(minute);
        }
        String sec;
        if (second < 10) {
            sec = "0" + second;
        } else {
            sec= Integer.toString(second);
        }
        return hour + ":" + min + ":" + sec + " " + a;
    }


    

}
