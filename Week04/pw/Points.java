import java.util.ArrayList;
import java.util.List;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

public class Point {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));
        points.add(new Point(-1, 8));

   
        Point north = points.get(0);
        Point south = points.get(0);
        Point west = points.get(0);
        Point east = points.get(0);

        for (Point point : points) {
            if (point.y > north.y) {
                north = point;
            }
            if (point.y < south.y) {
                south = point;
            }
            if (point.x < west.x) {
                west = point;
            }
            if (point.x > east.x) {
                east = point;
            }
        }

   
        System.out.println("Northernmost point: " + north);
        System.out.println("Southernmost point: " + south);
        System.out.println("Westernmost point: " + west);
        System.out.println("Easternmost point: " + east);
    }
}
