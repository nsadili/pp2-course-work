import java.util.*;
public class Time {public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int seconds = scn.nextInt();

    double hours = 1.0*(seconds / 3600);

    double minutes = 1.0*(seconds / 60);

    System.out.print( "hours:" + hours  + " " + "minutes:" + minutes + " " + "seconds:" + seconds);
}}