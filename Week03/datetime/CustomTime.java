package Week03.datetime;

public class CustomTime {

    private int hour;
    private int minute;
    private int second;


    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public CustomTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }


    public CustomTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }


    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }


    public CustomTime(CustomTime time) {
        this(time.hour, time.minute, time.second);
    }


    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return this.hour;
    }


    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getMinute(){
        return this.minute;
    }


    public void setSecond(int second){
        this.second = second;
    }
    public int getSecond(){
        return this.second;
    }


    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }


    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
          (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
          getMinute(),
          getSecond(),
          getHour() < 12 ? "AM" : "PM");
      }
}
