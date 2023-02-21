import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Pointsarr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Point> points = new ArrayList<>();
        int numPoints;

        System.out.print("Enter the number of points: ");
        numPoints = scanner.nextInt();

        for (int i = 1; i <= numPoints; i++) {
            System.out.print("Enter x and y coordinates of point " + i + ": ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        Point north = points.get(0);
        Point south = points.get(0);
        Point west = points.get(0);
        Point east = points.get(0);

        for (Point p : points) {
            if (p.y > north.y) {
                north = p;
            }
            if (p.y < south.y) {
                south = p;
            }
            if (p.x < west.x) {
                west = p;
            }
            if (p.x > east.x) {
                east = p;
            }
        }

        System.out.println("Northern point: " + north);
        System.out.println("Southern point: " + south);
        System.out.println("Western point: " + west);
        System.out.println("Eastern point: " + east);

        scanner.close();
    }
}
