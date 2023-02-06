import java.util.Scanner;
public class Converting_seconds {
    public static void main (String [] args){
        Scanner input =  new Scanner (System.in);
        int seconds;
        int minutes;
        int hours;

        System.out.print("Enter the number of seconds:");

        seconds = input.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;

        System.out.printf("The time entered in hours: %d\n",hours);
        System.out.printf("The time entered in minute: %d\n", minutes);
        System.out.printf("The time entered in seconds: %d\n", seconds);
    }
}
