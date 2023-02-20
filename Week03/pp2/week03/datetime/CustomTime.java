package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int min;
    private int sec;

    public CustomTime(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public CustomTime() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public CustomTime(int hour) {
        this.hour = hour;
        this.min = 0;
        this.sec = 0;
    }

    public CustomTime(int hour, int min) {
        this.hour = hour;
        this.min = min;
        this.sec = 0;
    }

    public CustomTime(CustomTime time) {
        this.hour = time.hour;
        this.min = time.min;
        this.sec = time.sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public String toStandardString() {
        int hour = getHour();
        boolean time = hour >= 12;
        hour %= 12;
        if (hour == 0) {
            hour = 12;
        }
        String format = time ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hour, min, sec, format);
    }
}
