package Week04;
import java.awt.Point;
public class ArrayOfPoints {
        public static void main(String[] args) {

            // create an array of points
            Point[] points = {
                    new Point(3, 4),
                    new Point(2, 6),
                    new Point(7, 1),
                    new Point(5, 5),
                    new Point(1, 2)
            };

            // find the northernmost, southernmost, westernmost, and easternmost points
            Point north = points[0];
            Point south = points[0];
            Point west = points[0];
            Point east = points[0];
            for (int i = 1; i < points.length; i++) {
                if (points[i].y < north.y) {
                    north = points[i];
                }
                if (points[i].y > south.y) {
                    south = points[i];
                }
                if (points[i].x < west.x) {
                    west = points[i];
                }
                if (points[i].x > east.x) {
                    east = points[i];
                }
            }

            // print the results
            System.out.println("Northernmost point: " + north);
            System.out.println("Southernmost point: " + south);
            System.out.println("Westernmost point: " + west);
            System.out.println("Easternmost point: " + east);
        }

    }


