package PPKESH;

import java.util.Scanner;

public class avarage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        scan.hasNextInt();
        scan.nextInt();

        var count = 0;
        var sum = 0;

        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            count++;

        }
        var avg = (float) sum / count;

    }
}
