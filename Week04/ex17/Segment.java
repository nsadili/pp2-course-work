package Week04.ex17;

import java.util.ArrayList;
import java.util.List;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


public class Segment {
    private final Point p1;
    private final Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return p1.distanceTo(p2);
    }

    public static Segment[] findShortestSegments(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return new Segment[0];
        }

        double minLength = Double.POSITIVE_INFINITY;
        List<Segment> shortestSegments = new ArrayList<>();

        for (Segment segment : segments) {
            double length = segment.length();
            if (length < minLength) {
                minLength = length;
                shortestSegments.clear();
                shortestSegments.add(segment);
            } else if (length == minLength) {
                shortestSegments.add(segment);
            }
        }

        return shortestSegments.toArray(new Segment[0]);
    }

    public static void main(String[] args) {
        // Create some example segments
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1, 0);
        Point p4 = new Point(1, 1);

        Segment[] segments = {
                new Segment(p1, p2),
                new Segment(p2, p4),
                new Segment(p4, p3),
                new Segment(p3, p1),
                new Segment(p1, p4)
        };

        // Find the shortest segments
        Segment[] shortestSegments = Segment.findShortestSegments(segments);

        // Print the shortest segments
        System.out.println("Shortest segments:");
        for (Segment segment : shortestSegments) {
            System.out.println(segment.p1 + " - " + segment.p2 + " (length = " + segment.length() + ")");
        }
    }
}

