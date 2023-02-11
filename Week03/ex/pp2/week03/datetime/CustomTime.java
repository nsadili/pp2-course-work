package pp2.week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;


 public CustomTime(int hour, int minute,int second){
    this.hour= hour;
    this.minute=minute;
    this.second= second;
 }
 public CustomTime(){
    this(0,0,0);
 }
 public CustomTime(int hour){
    this(hour,0,0);

 }
 public CustomTime(int hour, int minute){
    this(hour,minute,0);
 }
 public CustomTime(CustomTime t){
    this(t.hour, t.minute,t.second);

 }
 public int getHour(){
    return hour;
 }
 public int getMinute(){
     return minute;

 }
 public int getSecond(){
    return second;
 }
 public String toUniversalString(){
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
 }
 public String toStandartString(){
   String st= " ";
   //st means standart time
   int hour =this.hour;
   if(hour==0){
      hour=12;
      st= "A.M";

   } else if(hour<12){
      st= "A.M";
   }else if(hour==12){

      st= "P.M";
   } else{
    hour = hour-12;
      st= "P.M";
}
 return String.format("%d:%02d:%02d %s", hour, this.minute, this.second,st);
 }


}

 
