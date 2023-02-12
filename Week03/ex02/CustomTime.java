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
        this(0, 0, 0);
    }
    public CustomTime( int hour) {
        this(hour, 0, 0);
    }
    public CustomTime( int hour, int minute) {
        this(hour, minute, 0);
    }
    public CustomTime(CustomTime time) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setHour(int hour) {
        if(hour >= 0 && hour < 24){
            this.hour = hour;
        }
        else{
            System.out.println("Invalid");
        }
    }
    public void setMinute(int minute) {
        if(minute >= 0 && hour < 60){
            this.minute = minute;
        }
        else{
            System.out.println("Invalid");
        }
    }
    public void setSecond(int second) {
        if(second >= 0 && hour < 60){
            this.second = second;
        }
        else{
            System.out.println("Invalid");
        }
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
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());

    }
    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
                getMinute(), getSecond(), getHour() < 12 ? "AM" : "PM");

    }
}
