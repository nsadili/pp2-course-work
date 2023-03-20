public class CustomTime {
    private int hour;
    private int minute;
    private int second;

   CustomTime(int hour, int minute, int second){

       this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

     CustomTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
     CustomTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

     CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

     CustomTime(CustomTime time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
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
    public void toUniversalString() {
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }

    public void toStandardString() {
        System.out.printf("%d:%02d:%02d %s",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
