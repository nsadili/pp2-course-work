package pp2.week03.datetime;

public class CustomDateTime {
 
    public static void main(String[] args) {
        
        int hour = Integer.parseInt(args[0]);
        int minute = Integer.parseInt(args[1]);
        int second = Integer.parseInt(args[2]);

        CustomTime time = new CustomTime(hour, minute, second);


        
    }

}
