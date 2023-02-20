package Week04;

import java.awt.Point;
import java.util.Scanner;

public class ArrayOfPoints {

    public static void most(Point[] point) {
        Point mostNorthern = point[0];
        Point mostSouthern = point[0];
        Point mostWestern = point[0];
        Point mostEastern = point[0];

        for (int i = 0; i < point.length; i++) {
            if (point[i].getY() > mostNorthern.getY()) {
                mostNorthern = point[i];
            }
            if (point[i].getY() < mostSouthern.getY()) {
                mostSouthern = point[i];
            }
            if (point[i].getX() < mostWestern.getX()) {
                mostWestern = point[i];
            }
            if (point[i].getX() > mostEastern.getX()) {
                mostEastern = point[i];
            }
        }
        System.out.println("Most Northern point: (" + (int)mostNorthern.getX() + "; " + (int)mostNorthern.getX() + ").");
        System.out.println("Most Southern point: (" + (int)mostSouthern.getX() + "; " + (int)mostSouthern.getX() + ").");
        System.out.println("Most Western point: (" + (int)mostWestern.getX() + "; " + (int)mostWestern.getX() + ").");
        System.out.println("Most Eastern point: (" + (int)mostEastern.getX() + "; " + (int)mostEastern.getX() + ").");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of points");

        int n = scanner.nextInt();
        Point[] point = new Point[n];

        for (int i = 0; i < point.length; i++) {
            point[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }

        most(point);
    }

}