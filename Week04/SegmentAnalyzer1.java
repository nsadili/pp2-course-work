public class SegmentAnalyzer1 {
    public static void main(String[] args) {
        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(5, 6)
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
        for (Point point : points) {
            if (point.getY() > northernPoint.getY()) {
                northernPoint = point;
            }
        }
        return northernPoint;
    }

    public static Point getSouthernPoint(Point[] points) {
        Point southernPoint = points[0];
        for (Point point : points) {
            if (point.getY() < southernPoint.getY()) {
                southernPoint = point;
            }
        }
        return southernPoint;
    }

    public static Point getWesternPoint(Point[] points) {
        Point westernPoint = points[0];
        for (Point point : points) {
            if (point.getX() < westernPoint.getX()) {
                westernPoint = point;
            }
        }
        return westernPoint;
    }

    public static Point getEasternPoint(Point[] points) {
        Point easternPoint = points[0];
        for (Point point : points) {
            if (point.getX() > easternPoint.getX()) {
                easternPoint = point;
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
