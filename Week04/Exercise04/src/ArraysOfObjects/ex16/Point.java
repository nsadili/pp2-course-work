package ArraysOfObjects.ex16;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x; this.y = y;
    }

    public double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p1.x + p1.x), 2));
    }

    public String getClosest(Point p) {
        Point North = new Point(0, 1);
        Point South = new Point(0, -1);
        Point East = new Point(1, 0);
        Point West = new Point(-1, 0);

        Point coor[] = {North, South, East, West};
        double distance[] = new double[4];
        for (int i = 0; i < coor.length; i++) {
            distance[i] = getDistance(p, coor[i]);
        }

        double minDis = getMin(distance);

        return findClosest(distance, minDis);
    }

    public static String findClosest(double d[], double m) {
        if (m == d[0]) return "North";
        if (m == d[1]) return "South";
        if (m == d[2]) return "East";
        return "West";
    }

    public double getMin(double arr[]) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
