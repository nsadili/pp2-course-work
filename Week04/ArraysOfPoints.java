public class Point {
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
}

public class PointUtils {
    public static void findExtremePoints(Point[] points) {
        Point northern = points[0];
        Point southern = points[0];
        Point eastern = points[0];
        Point western = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getLatitude() > northern.getLatitude()) {
                northern = points[i];
            }
            if (points[i].getLatitude() < southern.getLatitude()) {
                southern = points[i];
            }
            if (points[i].getLongitude() > eastern.getLongitude()) {
                eastern = points[i];
            }
            if (points[i].getLongitude() < western.getLongitude()) {
                western = points[i];
            }
        }

        System.out.println("Northern point: " + northern.getLatitude() + ", " + northern.getLongitude());
        System.out.println("Southern point: " + southern.getLatitude() + ", " + southern.getLongitude());
        System.out.println("Eastern point: " + eastern.getLatitude() + ", " + eastern.getLongitude());
        System.out.println("Western point: " + western.getLatitude() + ", " + western.getLongitude());
    }
}

