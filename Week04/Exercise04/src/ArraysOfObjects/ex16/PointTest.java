package ArraysOfObjects.ex16;

import java.util.Scanner;

public class PointTest {
    public static void main(String args[]) {
        Point arr[] = new Point[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            arr[i] = new Point(x, y);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getClosest(arr[i]));
        }
    }
}
