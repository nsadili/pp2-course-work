import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfPoints {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        // add points to the list
        points.add(new Point(15, 56));
        points.add(new Point(-7, 34));
        points.add(new Point(0, -57));
        points.add(new Point(-15, -43));
        points.add(new Point(20, 10));

        Point north = null;
        Point south = null;
        Point west = null;
        Point east = null;

        for (Point point : points) {
            if (north == null || point.y > north.y) {
                north = point;
            }
            if (south == null || point.y < south.y) {
                south = point;
            }
            if (west == null || point.x < west.x) {
                west = point;
            }
            if (east == null || point.x > east.x) {
                east = point;
            }
        }

        System.out.println(northern);
        System.out.println(southern);
        System.out.println(western);
        System.out.println(eastern);
    }
}