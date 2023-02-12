public class CustomTime {
    int hour = 0;
    int minute = 0;
    int second = 0;

    // constructors
    public CustomTime(int hour){
        this.setHour(hour);
    }
    public CustomTime(int hour, int minute){
        this.setHour(hour);
        this.setMinute(minute);
    }
    public CustomTime(){
    }
    public CustomTime(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    public CustomTime(CustomTime time){
        time.hour = this.hour;
        time.minute = this.minute;
        time.second = this.second;
    }

    // setters and getters
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
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
    
    // other methods
    public void toUniversalString(String note, CustomTime time){
        System.out.printf("%s %02d:%02d:%02d\n", note, time.hour, time.minute, time.second);
    }
    public void toStandardString(String note, CustomTime time){
        System.out.printf("%s %02d:%02d:%02d %s\n", note, (time.hour > 12 ? time.hour - 12 : time.hour),
        time.minute, time.second, (time.hour > 12 ? "PM" : "AM"));
    }
}
