package Arrayofobjects.pw;

import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of points: ");
        int n = scan.nextInt();
        points(n, scan);
        scan.close();
    }

    public static void points(int n, Scanner scan) {
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int east = -999999;
        int west = 999999;
        int north = -9999999;
        int south = 99999999;

        for (int i = 0; i < n; i++) {
            // Read the opening parenthesis
            scan.useDelimiter("\\(");
            scan.next();

            // Read the x-coordinate
            arr[i] = scan.nextInt();

            // Read the comma separator
            scan.useDelimiter(",");
            scan.next();

            // Read the y-coordinate
            arr2[i] = scan.nextInt();

            // Read the closing parenthesis
            scan.useDelimiter("\\)");
            scan.next();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > east) {
                east = arr[i];
            }
            if (arr[i] < west) {
                west = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr2[i] > north) {
                north = arr2[i];
            }
            if (arr2[i] < south) {
                south = arr2[i];
            }
        }

        System.out.println("West: " + west);
        System.out.println("East: " + east);
        System.out.println("South: " + south);
        System.out.println("North: " + north);
    }
}
