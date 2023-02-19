import java.text.Format;
import javax.swing.event.SwingPropertyChangeSupport;

public class CustomTime {
    String am;
    int hour;
    int minute;
    int second;
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
    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
    public String toUniversalString(){
        return String.format("%d:%d:%d",this.hour,this.minute,this.second);
    }
    public String toStandardString(){
     if(hour<12)  this.am="AM";else this.am="PM";
        return String.format("%d:%d:%d %s",this.hour,this.minute,this.second,this.am);
    }
    public void TestProg(){
        System.out.println(toUniversalString());
        System.out.println(toStandardString());
    }
}


