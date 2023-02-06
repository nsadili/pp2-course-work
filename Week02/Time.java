import java.util.*;

public class Time {    public static void main(String[] args)

{Scanner scn = new Scanner(System.in);

    int sec = scn.nextInt();

    double hrs = 1.0*(sec/ 3600);

    double min = 1.0*(sec / 60);

    System.out.println( "hrs=" + hrs  + " " + "min=" + min + " " + "sec=" + sec);}}
