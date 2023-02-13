package pp2.week03.datetime;

import pp2.week03.geometry;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public CustomTime(int hour, int minute, int second){
        setHour(hour);setSecond(second);setMinute(minute);
    }
    public CustomTime(){
        setHour(0);setSecond(0);setMinute(0);
    }
    public CustomTime(int hour){
        setHour(hour);setSecond(0);setMinute(0);
    }
    public CustomTime(int hour, int minute){
        setHour(hour);setSecond(0);setMinute(minute);
    }
    public CustomTime(CustomTime time){
        CustomTime CustomTime= new CustomTime(getHour(),getMinute(),getSecond());
    }
    public String toUniversalString(){return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());}
    public String  toStandardString(){
        String am_pm="AM";
        if(hour>12){hour-=12;am_pm="PM";}
        return String.format("%d:%02d:%02d %s", getHour(),getMinute(),getSecond(),am_pm);
    }
}