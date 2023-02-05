import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    System.out.println("Seconds: ");
    double a = sc.nextDouble();
    System.out.println("minutes: "+ (a/60));
    System.out.println("hours: "+ ((a/60)/60));
    }
}