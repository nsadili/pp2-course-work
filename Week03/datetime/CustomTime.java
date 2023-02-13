package pp2.week03.datetime;

public class CustomTime {
    int hour, minute, second;
    CustomTime time;

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime() {

    }

    public CustomTime(int hour) {
        this.hour = hour;
    }

    public CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public CustomTime(CustomTime time) {
        this.time = time;
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
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public String toStandardString() {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
        } else {
            ampm = "PM";
        }
        if (hour == 0) {
            hour = 12;
        } else {
            hour = hour % 12;
        }
        return this.hour + ":" + this.minute + ":" + this.second + ampm;
    }

    public static void main(String[] args) {

    }
}
