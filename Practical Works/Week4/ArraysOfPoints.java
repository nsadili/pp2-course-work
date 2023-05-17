import java.util.ArrayList;
import java.util.List;

class Point {
    double lat;
    double longi;

    Point(double lat, double longi) {
        this.lat = lat;
        this.longi = longi;
    }
}

public class ArraysOfPoints {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        // Add your points here
        points.add(new Point(37.7749, -122.4194)); // Example point 1
        points.add(new Point(34.0522, -118.2437)); // Example point 2
        points.add(new Point(39.9042, 116.4074)); // Example point 3

        Point northernPoint = null;
        Point southernPoint = null;
        Point westernPoint = null;
        Point easternPoint = null;

        for (Point point : points) {
            if (northernPoint == null || point.lat > northernPoint.lat) {
                northernPoint = point;
            }

            if (southernPoint == null || point.lat < southernPoint.lat) {
                southernPoint = point;
            }

            if (westernPoint == null || point.longi < westernPoint.longi) {
                westernPoint = point;
            }

            if (easternPoint == null || point.longi > easternPoint.longi) {
                easternPoint = point;
            }
        }

        System.out.println("Northern point: latitude = " + northernPoint.lat + ", longitude = " + northernPoint.longi);
        System.out.println("Southern point: latitude = " + southernPoint.lat + ", longitude = " + southernPoint.longi);
        System.out.println("Western point: latitude = " + westernPoint.lat + ", longitude = " + westernPoint.longi);
        System.out.println("Eastern point: latitude = " + easternPoint.lat + ", longitude = " + easternPoint.longi);
    }
}
