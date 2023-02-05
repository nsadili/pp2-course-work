import java.util.Scanner;

public class Time {
   
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int sec = scan.nextInt();

            int hour = sec / 3600;
            int min = sec % 3600 / 60;
            int Sec = sec % 60;
            System.out.printf("%d %d %d\n", hour, min, Sec);

        }
        }
    }
    

