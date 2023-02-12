package pw4.objects;

public class CustomTime {
    private int hour;
    private int minute;
    private int second; 

    public CustomTime(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    public CustomTime(int hour, int minute){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(0);
    }
    public CustomTime(int hour){
        this.setHour(hour);
        this.setMinute(0);
        this.setSecond(0);
    }
    public CustomTime(){
        this.setHour(0);
        this.setMinute(0);
        this.setSecond(0);
    }
    public CustomTime(CustomTime time){
        this.setHour(time.getHour());
        this.setMinute(time.getMinute());
        this.setSecond(time.getSecond());
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandardString(){
        int hrsIn12 = hour;
        String timeExtension = "AM";
        if (12 == hour) {
            timeExtension = "PM";
        }
        if (12 < hour) {
            timeExtension = "PM";
            hrsIn12 = hour - 12;
        }
        return String.format("%02d:%02d:%02d %s", hrsIn12, minute, second, timeExtension);
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
