import java.util.Scanner;

public class Time{
    public static void main(String[] args) throws Exception {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of seconds: ");
     int seconds = sc.nextInt();
     int hours = seconds / 3600;
     seconds = seconds % 3600;
     int minutes = seconds / 60;
     seconds = seconds % 60;
     System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    
    }
}
