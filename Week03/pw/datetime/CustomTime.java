public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public CustomTime(int hour) {
        this(hour, 0, 0);
    }

    public CustomTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    private void setHour(int hour) {
        this.hour = ((hour >= 0 && hour < 24) ? hour : 0);
    }

    public int getMinute() {
        return minute;
    }

    private void setMinute(int minute) {
        this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
    }

    public int getSecond() {
        return second;
    }

    private void setSecond(int second) {
        this.second = ((second >= 0 && second < 60) ? second : 0);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toStandardString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}