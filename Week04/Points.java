package Week04;
import java.awt.Point;
import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many points?");
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        printMostNSWE(points);
    }

    public static void printMostNSWE(Point[] points) {
        Point mostNorthern = points[0];
        Point mostSouthern = points[0];
        Point mostWestern = points[0];
        Point mostEastern = points[0];
        for (Point point : points) {
            if (point.getY() > mostNorthern.getY()) {
                mostNorthern = point;
            }
            if (point.getY() < mostSouthern.getY()) {
                mostSouthern = point;
            }
            if (point.getX() < mostWestern.getX()) {
                mostWestern = point;
            }
            if (point.getX() > mostEastern.getX()) {
                mostEastern = point;
            }
        }
        System.out.println("Most Northern point is: (" + (int)mostNorthern.getX() + "; " + (int)mostNorthern.getX() + ").");
        
        
        System.out.println("Most Southern point is: (" + (int)mostSouthern.getX() + "; " + (int)mostSouthern.getX() + ").");
        System.out.println("Most Western point is: (" + (int)mostWestern.getX() + "; " + (int)mostWestern.getX() + ").");
        System.out.println("Most Eastern point is: (" + (int)mostEastern.getX() + "; " + (int)mostEastern.getX() + ").");
    }
}