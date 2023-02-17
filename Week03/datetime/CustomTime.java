package Week03.datetime;

public class CustomTime {
    private int hour, minute, second;

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour + minute / 60 + (minute % 60 + second / 60) / 60;
        this.minute = (minute % 60 + second / 60) % 60;
        this.second = second / 60;
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
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

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

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String toStandardString() {
        int hour = this.hour % 12;
        return String.format("%02d:%02d:%02d %s", hour == 0 ? 12 : hour, this.minute, this.second, (this.hour % 24) / 12 == 0 ? "AM" : "PM");
    }

    public String toString() {
        return this.toUniversalString();
    }
}
