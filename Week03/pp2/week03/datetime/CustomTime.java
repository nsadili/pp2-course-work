package pp2.week03.datetime;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class CustomTime {
    int hour;
    int minute;
    int second;
    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public void Time(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public void Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setHour(int hour){
        this.hour = hour;
    }

   
   
    public CustomTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public CustomTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    
    public CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    
    // Copies a given CustomTime object and creates a new CustomTime object
    public CustomTime(CustomTime time) {
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }
    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    String amPm;
    public String toStandart()
    {
        int newhour = hour % 12;
        if (hour< 12)
        {
             amPm = "AM";
        } else  amPm = "PM";
        return String.format("%d:%02d:%02d %s", newhour, minute, second, amPm );
    }

}
