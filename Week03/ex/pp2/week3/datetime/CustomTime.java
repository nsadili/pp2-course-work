package pp2.week3.datetime;

public class CustomTime {
    private int hour;
    private int min;
    private int sec;

    public CustomTime() {
        this(0, 0, 0);
    }

    public CustomTime(int hour) {
        this(hour, 0, 0);

    }

    public CustomTime(int hour, int min) {
        this(hour, min, 0);
    }

    public CustomTime(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public CustomTime(CustomTime time) {

        this.hour = time.hour;
        this.min = time.min;
        this.sec = time.sec;

    }

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", hour, min, sec);

    }

    public String toStandartString() {
        if (hour >= 0 && hour < 12) {
            return String.format("%d:%02d:%02d PM", hour, min, sec);
        } else {
            var copyhour = hour - 12;
            return String.format("%d:%02d:%02d AM", copyhour, min, sec);
        }
    }

}
