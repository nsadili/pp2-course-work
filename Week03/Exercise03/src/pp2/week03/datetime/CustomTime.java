package pp2.week03.datetime;

public class CustomTime {
    private int h;
    private int m;
    private int s;

    public CustomTime() {
    }
    public CustomTime(int h) {
        this.h = h;
    }
    public CustomTime(int h, int m) {
        this.h = h; this.m = m;
    }
    public CustomTime(int h, int m, int s) {
        this.h = h; this.m = m; this.s = s;
    }

    public CustomTime(CustomTime time) {
        this.h = time.h; this.m = time.m; this.s = time.s;
    }

    public int getHour() {
        return this.h;
    }
    public void setHour(int h) {
        this.h = h;
    }

    public int getMinute() {
        return this.m;
    }
    public void setMinute(int m) {
        this.m = m;
    }

    public int getSecond() {
        return this.s;
    }
    public void setSecond(int s) {
        this.s = s;
    }

    public String toUniversalString() {
        return (String.format("%02d", this.h) + ":"
        + String.format("%02d", this.m) + ":"
        + String.format("%02d", this.s));
    }

    public String toStandardString() {
        if (this.h == 0)
            return ("12" + ":" + String.format("%02d", this.m) + ":"
            + String.format("%02d", this.s) + " AM");
        if (this.h < 12)
            return (this.h + ":" + String.format("%02d", this.m) + ":"
            + String.format("%02d", this.s) + " AM");
        if (this.h == 12)
            return ("12" + ":" + String.format("%02d", this.m) + ":"
            + String.format("%02d", this.s) + " PM");
        return ((this.h - 12) + ":" + String.format("%02d", this.m) + ":"
        + String.format("%02d", this.s) + " PM");
    }
}
