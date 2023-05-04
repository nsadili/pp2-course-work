import java.util.ArrayList;

public class PointFinder {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(35.689487, 51.374108)); // Tehran, Iran
        points.add(new Point(51.507351, -0.127758)); // London, UK
        points.add(new Point(40.712776, -74.005974)); // New York, USA
        points.add(new Point(-33.868820, 151.209296)); // Sydney, Australia

        Point north = null, south = null, west = null, east = null;
        for (Point point : points) {
            if (north == null || point.getLatitude() > north.getLatitude()) {
                north = point;
            }
            if (south == null || point.getLatitude() < south.getLatitude()) {
                south = point;
            }
            if (west == null || point.getLongitude() < west.getLongitude()) {
                west = point;
            }
            if (east == null || point.getLongitude() > east.getLongitude()) {
                east = point;
            }
        }

        System.out.println("Most Northern Point: " + north);
        System.out.println("Most Southern Point: " + south);
        System.out.println("Most Western Point: " + west);
        System.out.println("Most Eastern Point: " + east);
    }
}
