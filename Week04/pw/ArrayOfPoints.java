import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfPoints {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(3, 4));
        points.add(new Point(7, -2));
        points.add(new Point(1, 9));
        points.add(new Point(-5, 2));
        points.add(new Point(0, 0));

        Point northern = getNorthernPoint(points);
        System.out.println("Most Northern point: " + northern);
        
        Point southern = getSouthernPoint(points);
        System.out.println("Most Southern point: " + southern);
        
        Point western = getWesternPoint(points);
        System.out.println("Most Western point: " + western);
        
        Point eastern = getEasternPoint(points);
        System.out.println("Most Eastern point: " + eastern);
    }

    public static Point getNorthernPoint(List<Point> points) {
        if (points.isEmpty()) {
            return null;
        }
        Point northern = points.get(0);
        for (Point point : points) {
            if (point.y > northern.y) {
                northern = point;
            }
        }
        return northern;
    }

    public static Point getSouthernPoint(List<Point> points) {
        if (points.isEmpty()) {
            return null;
        }
        Point southern = points.get(0);
        for (Point point : points) {
            if (point.y < southern.y) {
                southern = point;
            }
        }
        return southern;
    }

    public static Point getWesternPoint(List<Point> points) {
        if (points.isEmpty()) {
            return null;
        }
        Point western = points.get(0);
        for (Point point : points) {
            if (point.x < western.x) {
                western = point;
            }
        }
        return western;
    }

    public static Point getEasternPoint(List<Point> points) {
        if (points.isEmpty()) {
            return null;
        }
        Point eastern = points.get(0);
        for (Point point : points) {
            if (point.x > eastern.x) {
                eastern = point;
            }
        }
        return eastern;
    }
}
