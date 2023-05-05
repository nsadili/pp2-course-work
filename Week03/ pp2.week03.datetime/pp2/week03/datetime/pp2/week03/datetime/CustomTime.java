

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

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

    public CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime(CustomTime time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
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
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardString() {
        String ampm = (hour < 12) ? "AM" : "PM";
        int hour12 = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return String.format("%d:%02d:%02d %s", hour12, minute, second, ampm);
    }
}
