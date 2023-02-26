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
    this.hour = 0;
    this.second = 0;
    this.minute = 0;
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

public CustomTime(CustomTime time)
{
 this.hour = time.hour;
 this.minute = time.minute;
 this.second = time.second;
}

public int getHour(){
    return hour;
}

public int getSecond() {
    return second;
}

public int getMinute() {
    return minute;
}

public String toUniversalString() {
    return String.format("%d:%d:%d", this.hour, this.minute, this.second);
}
public String toStandardString() {
    if (this.hour<=12) {
    return toUniversalString() + " AM";
    }
    else {
    return toUniversalString() + " PM";
}
}

}

