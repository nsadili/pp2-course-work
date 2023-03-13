package practicalworks;

public class Main {
    public static void main(String[] args) {
        Point[] points = {
            new Point(40.7128, -74.0060),
            new Point(37.7749, -122.4194),
            new Point(51.5074, -0.1278),
            new Point(35.6895, 139.6917),
        };

        Point north = points[0];
        Point south = points[0];
        Point west = points[0];
        Point east = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getLat() > north.getLat()) {
                north = points[i];
            }
            if (points[i].getLat() < south.getLat()) {
                south = points[i];
            }
            if (points[i].getLon() < west.getLon()) {
                west = points[i];
            }
            if (points[i].getLon() > east.getLon()) {
                east = points[i];
            }
        }

        System.out.println("Northernmost point: " + north);
        System.out.println("Southernmost point: " + south);
        System.out.println("Westernmost point: " + west);
        System.out.println("Easternmost point: " + east);
    }
}

