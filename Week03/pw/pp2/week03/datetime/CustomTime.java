package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public CustomTime(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    public CustomTime(int hour){
        this.hour=hour;
        this.minute=0;
        this.second=0;
    }
    public CustomTime(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
        this.second=0;
    }

    public CustomTime(CustomTime time){
        this.hour=time.hour;
        this.minute=time.minute;
        this.second=time.second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    
    public String toStandartString(){
        if (hour < 12) {
            return String.format("%02d:%02d:%02d AM", hour, minute, second);
        } else {
            return String.format("%02d:%02d:%02d PM", hour-12, minute, second);
        }
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
}
