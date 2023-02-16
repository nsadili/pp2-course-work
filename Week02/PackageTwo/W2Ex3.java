package PackageTwo;

import java.util.Scanner;

public class W2Ex3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Write seconds: ");
    int x = sc.nextInt();

    sc.close();

     int hour = x / 3600;
     int min = (x % 3600) / 60;
     int sec = (x % 3600) % 60;

    System.out.println("Time = " + hour + ":" + min + ":" + sec);

    }
}

