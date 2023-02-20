import java.awt.Point;

public class PointScanner {
    public static void main(String[] args) {
        Point[] points = {new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8)};

        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];

        for (int i = 1; i < points.length; i++) {
            Point p = points[i];
            if (p.y < northern.y) {
                northern = p;
            }
            if (p.y > southern.y) {
                southern = p;
            }
            if (p.x < western.x) {
                western = p;
            }
            if (p.x > eastern.x) {
                eastern = p;
            }
        }

        System.out.println("Northernmost point: " + northern);
        System.out.println("Southernmost point: " + southern);
        System.out.println("Westernmost point: " + western);
        System.out.println("Easternmost point: " + eastern);
    }
}
