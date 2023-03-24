import java.awt.Point;
import java.util.Scanner;

public class ArrayOfPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = sc.nextInt();

        Point[] points = new Point[n];

        // Read the points from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the x coordinate of point " + (i+1) + ": ");
            int x = sc.nextInt();
            System.out.print("Enter the y coordinate of point " + (i+1) + ": ");
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        // Find the most Northern, Southern, Western and Eastern points
        Point north = points[0];
        Point south = points[0];
        Point west = points[0];
        Point east = points[0];

        for (int i = 1; i < n; i++) {
            if (points[i].y > north.y) {
                north = points[i];
            }
            if (points[i].y < south.y) {
                south = points[i];
            }
            if (points[i].x < west.x) {
                west = points[i];
            }
            if (points[i].x > east.x) {
                east = points[i];
            }
        }

        // Print the results
        System.out.println("Most Northern Point: " + north.toString());
        System.out.println("Most Southern Point: " + south.toString());
        System.out.println("Most Western Point: " + west.toString());
        System.out.println("Most Eastern Point: " + east.toString());
    }
}
