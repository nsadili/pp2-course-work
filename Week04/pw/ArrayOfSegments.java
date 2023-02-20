import java.awt.Point;
import java.util.ArrayList;

public class ArrayOfSegments {
    public static void main(String[] args) {
        Segment[] segments = new Segment[3];
        segments[0] = new Segment(new Point(0, 0), new Point(0, 10));
        segments[1] = new Segment(new Point(0, 0), new Point(10, 0));
        segments[2] = new Segment(new Point(0, 0), new Point(5, 5));

        Segment[] shortestSegments = findShortestSegments(segments);

        System.out.println("Shortest segment(s):");
        for (Segment segment : shortestSegments) {
            System.out.println(segment);
        }
    }

    public static Segment[] findShortestSegments(Segment[] segments) {
        double minLength = Double.POSITIVE_INFINITY;

       
        for (Segment segment : segments) {
            double length = segment.getLength();
            if (length < minLength) {
                minLength = length;
            }
        }

        
        ArrayList<Segment> shortestSegments = new ArrayList<Segment>();
        for (Segment segment : segments) {
            if (segment.getLength() == minLength) {
                shortestSegments.add(segment);
            }
        }

        Segment[] result = new Segment[shortestSegments.size()];
        shortestSegments.toArray(result);

        return result;
    }
}

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return p1.distance(p2);
    }

    public String toString() {
        return "Segment from " + p1 + " to " + p2;
    }
}
