import java.util.Scanner;
public class Time {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber of seconds: ");
        int totalsec = sc.nextInt();
        int hours = totalsec / 3600;
        int minutes = (totalsec % 3600) / 60;
        int seconds = totalsec % 60;
        System.out.println(hours+" hours, " +minutes+ " minutes " +seconds+ " seconds");
    }
}
