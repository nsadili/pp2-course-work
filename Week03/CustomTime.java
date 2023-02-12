package pp2.week3.datetime;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hours) {
        this(hours, 0, 0);
    }

    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public Time(Time time) {
        this(time.hours, time.minutes, time.seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours >= 0 && hours <= 23 ? hours : 0;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes >= 0 && minutes <= 59 ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds >= 0 && seconds <= 59 ? seconds : 0;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }

    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
                (getHours() == 0 || getHours() == 12) ? 12 : getHours() % 12,
                getMinutes(),
                getSeconds(),
                getHours() < 12 ? "AM" : "PM");
    }
}
