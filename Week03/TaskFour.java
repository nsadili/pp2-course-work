// CUSTOM_TIME
package pp2.week0.datetime;

public class CustomTime {
    private int hour;
    private int minute;

    private int second;

    public CustomTime(int hour, int minute, int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

   public CustomTime(){
        this(0, 0, 0);
   }

   public CustomTime(int hour){
        this(hour, 0, 0);
   }
public CustomTime(int hour, int minute){
        this(hour, minute, 0);
}

public CustomTime(CustomTime time){
        this(time.getHour(), time.getMinute(), time.getSecond());
}


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
   /* public String toStandartString() {
        CAN NOT FIND HOW TO DO
    } */
    }

//CUSTOM_TIME_TEST

package pp2.week0.datetime;

public class CustomTimeTest {
    public static void main(String[] args) {
    CustomTime Time = new CustomTime(3, 14, 30);
    CustomTime TIME = new CustomTime();
    CustomTime TiME = new CustomTime(4);
    CustomTime TIMe = new CustomTime(4, 30);
    CustomTime tImE = new CustomTime(Time);

    System.out.println("Time: " + Time.toUniversalString());
       // System.out.println("Time (standard): " + Time.toStandardString());
        System.out.println("TIME: " + TIME.toUniversalString());
       // System.out.println("TIME (standard): " + TIME.toStandardString());
        System.out.println("TiME: " + TiME.toUniversalString());
        //System.out.println("TiME (standard): " + TiME.toStandardString());
        System.out.println("TIMe: " + TIMe.toUniversalString());
       // System.out.println("TIMe (standard): " + TIMe.toStandartString());
}
}
