import java.util.*;

public class ArrayOfPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numPoints = scanner.nextInt();
        scanner.nextLine();

        Point north = null;
        Point south = null;
        Point west = null;
        Point east = null;

        for (int i = 0; i < numPoints; i++) {
            System.out.println("Enter information for point #" + (i+1));
            System.out.print("Latitude: ");
            double latitude = scanner.nextDouble();
            System.out.print("Longitude: ");
            double longitude = scanner.nextDouble();
            scanner.nextLine();

            Point point = new Point(latitude, longitude);

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

        System.out.println("Most Northern point: " + north);
        System.out.println("Most Southern point: " + south);
        System.out.println("Most Western point: " + west);
        System.out.println("Most Eastern point: " + east);

        scanner.close();
    }
}

class Point {
    private double latitude;
    private double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }
}
