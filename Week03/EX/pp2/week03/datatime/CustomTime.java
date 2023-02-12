package pp2.week03.datatime;

public class CustomTime {
    private int hour;

    private int min;

    private int sec;

    public CustomTime(int hour, int min, int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public CustomTime(){
this.hour=0;
this.min=0;
this.sec=0;
    }
public CustomTime (int hour){
this.hour=hour;
this.min=0;
this.sec=0;
}
public CustomTime (int hour, int min){
    this.hour=hour;
    this.min=min;
    this.sec=0;
}
public CustomTime(CustomTime time){
  time.hour=this.hour;
  time.min=this.min;
  time.sec=this.sec;  
}
public int getHour() {
    return hour;
}
public int getMin() {
    return min;
}
public int getSec() {
    return sec;
}
public String toUniversalString(){
  return String.format("Universal Time: %02d:%02d:%02d\n",this.hour,this.min,this.sec); 
}
public String toStandartString(){
    int copyhour;
    copyhour=hour;
if(hour == 0) copyhour=12;
if(hour>12) copyhour=hour%12;
    return String.format("Custom Time: %d:%02d:%02d %s\n",copyhour,min,sec,(hour < 12 ? "AM" : "PM"));
    
    
}
}
