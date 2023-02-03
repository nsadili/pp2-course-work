// package Week02.pw;

public class LeapYear {
    public static void main(String args[]){
        int year = Integer.valueOf(args[0]);
        if(year%4 == 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
