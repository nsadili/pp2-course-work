public class PointAnalyzer {
    public static void main(String[] args) {
        // Sample points
        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(5, 6),
            new Point(7, 8),
            new Point(9, 10)
        };

        Point northernPoint = getNorthernPoint(points);
        Point southernPoint = getSouthernPoint(points);
        Point westernPoint = getWesternPoint(points);
        Point easternPoint = getEasternPoint(points);

        System.out.println("Northern Point: " + northernPoint);
        System.out.println("Southern Point: " + southernPoint);
        System.out.println("Western Point: " + westernPoint);
        System.out.println("Eastern Point: " + easternPoint);
    }

    public static Point getNorthernPoint(Point[] points) {
        Point northernPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getY() > northernPoint.getY()) {
                northernPoint = points[i];
            }
        }

        return northernPoint;
    }

    public static Point getSouthernPoint(Point[] points) {
        Point southernPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getY() < southernPoint.getY()) {
                southernPoint = points[i];
            }
        }

        return southernPoint;
    }

    public static Point getWesternPoint(Point[] points) {
        Point westernPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getX() < westernPoint.getX()) {
                westernPoint = points[i];
            }
        }

        return westernPoint;
    }

    public static Point getEasternPoint(Point[] points) {
        Point easternPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getX() > easternPoint.getX()) {
                easternPoint = points[i];
            }
        }

        return easternPoint;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
